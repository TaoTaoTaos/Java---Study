## 一、前言
&emsp;&emsp; 开始是跟着黑马程序员那个练习，做一个拼图小游戏的，但是自己发现那个拼图游戏根本没咋用到面向对象的编程思想，让我觉得很不自然，所以自己做了这个更加有面向对象思想的拼图游戏，也适合初学者入门。
## 二、介绍
程序主要由三部分组成
- APP
- BaseUi
- Puzzle
### 2.1APP

main函数，负责调用BaseUi界面，启动游戏。
### 2.2Baseui

使用swing框架进行可视化的设计
- initFace()
用于绘制程序窗口<br>
Toolkit 里有getScreenSize的方法，可以获取用户显示器大小，可以做到把生成的窗口居中到屏幕。<br>
setLayout： null，不然所有元素都会居中<br>
setVisible：true，不然看不见窗口<br>
setAlwaysOnTop：false 不要当流氓软件<br>
setTitle：小游戏<br>
setSize(419, 463);419是我的生日<br>
setResizable(false);不可变大小<br>
setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);设置关闭模式：点了×就结束程序<br>
addKeyListener：全局的键盘监听，这里设置按住A键，就把所有拼图删除，再展示出完整拼图的样子

```java
public void keyPressed(KeyEvent e) {  
int code = e.getKeyCode();  
if (code == 65) {  
System.out.println("A被按下");  
//清除所有拼图 labelfor (int i = 0; i < 3; i++) {  
for (int j = 0; j < 3; j++) {  
remove(All_puzzles[i][j].getLabel());  
}  
}  
  
  
all.setBounds(2, 2, 400, 400);  
add(all);  
revalidate();  
repaint();  
}  
}
```

同时，松开A键，把原有拼图布局复原

```java
public void keyReleased(KeyEvent e) {  
int code = e.getKeyCode();  
if (code == 65) {  
remove(all);  
System.out.println("A被松开");  
Reprint(All_puzzles);  
revalidate();  
repaint();  
}  
}
```

这就是程序最基本的“舞台”


### 2.3拼图对象(Puzzle)

==**最关键的部分是拼图对象的创建**==

==**还有拼图与用户的交互**==

- ==首先思考==
- 1.拼图对象应该有什么信息
- 2.拼图如何交互、移动

其中拼图的这些属性很好想到：
- 编号 1-9
- 拼图图案  (ImageIcon，是图片的容器)
- JLabel(因为每块拼图都当做一个对象了，JLabel就是每块拼图的容器)

为了交互和移动，还能想到：
- x坐标
- y坐标

这里就默认用二维数组存储了，到时候创建一个全是拼图的数组来管理拼图，很自然

现在应该想，游戏是要有胜利的判断的，怎么判断？

这里我使用【初始】和【实时】两个坐标来记录在拼图里，初始化时【初始】 == 【实时】
游戏过程中【实时】坐标不断变化，胜利的条件是最后又有【初始】 == 【实时】

同时拼图游戏又是特殊的，他有一块空白块，知道空白块的位置是比较关键的，于是用sign表示拼图标识 ： 0 代表【普通拼图】 ， 1 代表空白的那块【特殊拼图】

这些是基本的拼图属性，但是还有一个重要的点，我们在移动拼图，就是在改变拼图在数组中的位置，这个数组就相当于记录着拼图的【布局】，每次移动拼图都重新打印这个布局，就能实现可视化了，所以很明显这个数组是创建在Baseui里面的。  

但是每一块拼图自己又是需要知道这个数组的信息的，否则拼图就没办法正确的改变位置了，于是拼图自己有一个``Puzzle[] [] puzzles``属性，用于和其他拼图【感知】和【交互】

至于其他count值用来记步之类的，就属于锦上添花的东西了

**讨论完属性，就该想拼图都有哪些方法了**


首先拼图会被点击
点击时，大部分拼图都不会动的，只有与空白块相邻的拼图才会改变位置，即与空白块交换位置。所以这里``Puzzle[] [] puzzles``的作用就体现了。

通过传入puzzles数组，每块拼图都能知道自己相邻拼图的信息，而信息里包含了sign， 0 代表【普通拼图】 ， 1 代表空白的那块【特殊拼图】，这样，执行交换拼图动作的逻辑就是，点击一块拼图时，先判断上下左右的拼图是不是那块空白拼图，如果是，再执行交换代码。

## 主要方法

交换拼图：

```JAVA
public void swapPuzzles(Puzzle p1, Puzzle p2) {  
  
for (int i = 0; i < 3; i++) {  
for (int j = 0; j < 3; j++) {  
puzzles[i][j].setCount(count++);  
}  
}  
// 交换拼图 的 【实时位置】  
int tempX = p1.x_location;  
int tempY = p1.y_location;  
p1.x_location = p2.x_location;  
p1.y_location = p2.y_location;  
p2.x_location = tempX;  
p2.y_location = tempY;  
  
// 交换拼图 的 【数组位置】  
puzzles[p1.x_location - 1][p1.y_location - 1] = p1;  
puzzles[p2.x_location - 1][p2.y_location - 1] = p2;  
  
//交换 拼图 的 label 的 bound ，即交换 【显示位置】  
p1.getLabel().setBounds(1 + (134 * (p1.y_location - 1)), 134 * (p1.x_location - 1), 134, 134);  
p2.getLabel().setBounds(1 + (134 * (p2.y_location - 1)), 134 * (p2.x_location - 1), 134, 134);  
//每次交换后，检查是否复原了  
boolean restored = true;  
for (int i = 0; i < 3; i++) {  
for (int j = 0; j < 3; j++) {  
if (puzzles[i][j].getX_location() != puzzles[i][j].getInit_x_location() || puzzles[i][j].getY_location() != puzzles[i][j].getInit_y_location()) {  
restored = false;  
break;  
}  
}  
if (!restored) {  
break;  
}  
}  
if (restored) {  
System.out.println("已经复原");  
} else {  
System.out.println("还未复原");  
}  
}//交换两块拼图的【位置】
```

>交换拼图的逻辑是在拼图类里，每次交换的最后都判断是否还原成功
>【实时位置】记录在拼图的x，y坐标里
>【数组位置】就是交换布局的位置
>【显示位置】额外的，还要交换label的bound，不然显示不出来


初始化：同时初始化了拼图和布局

```java
private void initPuzzle(String s) {  
  
//初始化 9 张拼图 ，其中第 9 张 是空白拼图  
  
int num = 0;//拼图编号  
for (int i = 0; i < 3; i++) {  
for (int j = 0; j < 3; j++) {  
  
  
ImageIcon image = new ImageIcon(s + (++num) + ".jpg");  
  
JLabel label = new JLabel(image);  
  
All_puzzles[i][j] = new Puzzle(num, i + 1, j + 1, image, label);//初始化所有拼图  
  
All_puzzles[i][j].setX_location(i + 1);  
All_puzzles[i][j].setY_location(j + 1);//拼图的 现在的位置 就是 【初始位置】  
  
  
All_puzzles[i][j].getLabel().setBounds(1 + (134 * j), 134 * i, 134, 134);  
  
if (num == 9) {  
All_puzzles[i][j].setSign(1); //其中第 9 张 标识为 “1” 代表特殊的【空白拼图】  
} else {  
All_puzzles[i][j].setSign(0);  
}  
  
All_puzzles[i][j].getLabel().setBorder(new BevelBorder(BevelBorder.RAISED));//每块拼图加个【边框】  
  
this.add(All_puzzles[i][j].getLabel());  
All_puzzles[i][j].show_puzzle(); //生成 puzzles 时 ，puzzle 【i，j】会展示一次自己的【信息】  
}  
}  
//把初始化好的【拼图布局】 存入 每块拼图  
for (int i = 0; i < 3; i++) {  
for (int j = 0; j < 3; j++) {  
All_puzzles[i][j].setPuzzles(All_puzzles);  
}  
}  
  
  
} //初始化 9 张拼图
```

Puzzle()是构造方法
代码就不重复写在这了。 

打乱数组：（即打乱布局）  

其实很多人可能没曾想过，如果只是用随机数打乱拼图数组元素，是会出现【死解】的情况的，就是最后会有两块拼图，位置相反，这样是100%无法被还原的。好像有数学上的方法，逆序数什么的，没太研究。这里使用了一直自然的方法，只要模拟用户乱点很多次拼图，不就打乱了吗，而且这样天生保证了没有死解。
```java
public void Random_Puzzle(Puzzle[][] puzzles) {  
Random mr = new Random();  
  
//拼图游戏是有【死解】的  
//通过交换与空白块相邻的块来打乱  
//就避免了出现死解  
for (int k = 0; k < 20; k++) {//找到 【空白块】 20次 并调换和他【与之相邻的块】 模拟手动移动了20步  
for (int i = 0; i < 3; i++) {  
for (int j = 0; j < 3; j++) {//先找到空白块是哪一块  
if (puzzles[i][j].getSign() == 1) {  
  
Puzzle leftPuzzle = null, rightPuzzle = null, upPuzzle = null, downPuzzle = null;  
  
//注意：【x，y】坐标是从1，1开始  
// 【数组】坐标是从0,0开始  
  
if (puzzles[i][j].getX_location() > 1) {//行数 大于 1 才有 【上】  
upPuzzle = puzzles[puzzles[i][j].getX_location() - 2][puzzles[i][j].getY_location() - 1];  
}  
if (puzzles[i][j].getX_location() < 3) {//行数 小于 3 才有 【下】  
downPuzzle = puzzles[puzzles[i][j].getX_location()][puzzles[i][j].getY_location() - 1];  
}  
if (puzzles[i][j].getY_location() > 1) {//列数 大于 1 才有 【左】  
leftPuzzle = puzzles[puzzles[i][j].getX_location() - 1][puzzles[i][j].getY_location() - 2];  
}  
if (puzzles[i][j].getY_location() < 3) {//列数 小于 3 才有 【右】  
rightPuzzle = puzzles[puzzles[i][j].getX_location() - 1][puzzles[i][j].getY_location()];  
}  
  
//空白块与一个相邻块交换  
Puzzle[] neighbors = {leftPuzzle, rightPuzzle, upPuzzle, downPuzzle};  
  
int count = 0;  
Puzzle[] save = new Puzzle[4];  
  
for (Puzzle neighbor : neighbors) {  
if (neighbor != null) {  
save[count] = neighbor;  
count++;  
}  
}  
  
if (count > 0) {  
int x = mr.nextInt(count);  
swapPuzzles(puzzles[i][j], save[x], puzzles);  
}  
}  
}  
}  
// Reprint(puzzles);  
revalidate();  
repaint();  
}  
  
//写入 现在 的坐标  
for (int i = 0; i < puzzles.length; i++) {  
for (int j = 0; j < puzzles[0].length; j++) {  
puzzles[i][j].setX_location(i + 1);  
puzzles[i][j].setY_location(j + 1);  
}  
}  
//把现在的拼图布局 给 每一块 拼图  
for (int i = 0; i < puzzles.length; i++) {  
for (int j = 0; j < puzzles[0].length; j++) {  
puzzles[i][j].setPuzzles(puzzles);  
}  
}  
Reprint(puzzles);  
System.out.println("拼图数组已打乱");  
}
```

剩下的问题就是这个swing框架的问题了，他做不到自动更新界面，所以每次涉及到改变拼图布局的时候，就要手动remove不要的lable，再把要展示的add上去，最后还要：
 ``revalidate(); `` ``repaint();``

然后界面的菜单栏，有一个套娃的问题 

层级关系是这样： 

JMenuBar ：一横条的菜单栏 

里面的选项叫做Jmenu


Jmenu里点开有JMenuItem

逻辑都写在JMenuItem里


最后Baseui只需要依次执行这个，就完成任务了：
```java
public BaseUi() {  
  
initFace();//初始化界面  
mode = 0;//默认选第一张图片  
initPuzzle(PATHS[mode]);//初始化拼图（mode1）  
Random_Puzzle(All_puzzles);  
  
JMenuBar();//基础界面的菜单栏  
  
this.setVisible(true);//设置可见  
  
  
}
```

最最后回到APP：

```java
public class App {  
public static void main(String[] args) {  
  
BaseUi UI = new BaseUi();  
  
}  
}
```

**大功告成！**

代码的注释挺详细的，应该都能看懂吧。 

很多地方还有不足，但是第一次写完一个小东西还是很有成就感哈哈哈



<p align="right">记于2024-1-5 10:19:52</p>