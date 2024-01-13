

# Java历史

Java是在1991年由SUN公司的**James Gosling**（Java之父）及其团队所研发的一种编程语言，第一个版本耗时18个月，最开始命名为Oak（一种橡树）。Java现在广泛应用于各种大型互联网应用，其设计的最初动机主要是平台独立（即体系结构中立）语言的需要，可以嵌入到各种消费类电子设备（家用电器等），但市场反应不佳。

随着1990年代互联网的发展，SUN公司看到了Oak在互联网上的应用场景，在1995年更名为Java（印度尼西亚爪哇岛的英文名称，因盛产咖啡而闻名），随着互联网的崛起，Java逐渐称为重要的Web应用开发语言。Java的发展可以主要看JavaWeb的发展，Java也见证了互联网的发展过程。

发展至今，Java不仅是一门编程语言，还是一个由一系列计算机软件和规范组成的技术体系，Java 是几乎所有类型的网络应用程序的基础，也是开发和提供嵌入式和移动应用程序、游戏、基于 Web 的内容和企业软件的全球标准。



说到Java自然离不开**JDK**、**JVM**、**JRE**，三者有什么关系。

**JDK**（Java Development Kit）Java开发工具包，包含Java语言、Java虚拟机、Java类库，是支持Java程序开发的最小环境。

**JVM**（Java Virtual Machine）Java虚拟机，运行于各种操作系统Linux，Windows，Solaris等之上，执行编译好的Java字节码class文件。

**JRE**（Java Runtime Environment）Java运行时环境，包含

1. JavaSE （适合做c/s程序）
2. **JavaEE** （适合做B/S程序）我们主要学习目标

中核心类库API和Java虚拟机，简单理解为JVM+核心类库API。



# Java基础

## 变量

**什么是变量？**（考点）

内存中的一块空间表示，三个要素：变量类型、变量名、变量值

常量是变量的一种特殊形态。

![image-20230712163205640](D:\网博学习资料\课堂笔记\笔记图片\image-20230712163205640.png)

### 八大基本类型

`boolean` 布尔类型

  true  false  通常使用判断语句中

整数:

  `byte`(1个字节)、`short`(2个)、`int`(4个)、`long`(8个)

小数\浮点数

  `float`(4个)、`double`(8个)  可以使用科学计数法

`char` ：

  单个字符  ‘A’==65, ‘a’==97，在内存中如何存储？通过ASCII码值

![img](D:\网博学习资料\课堂笔记\笔记图片\ascii-1-1.png)

![img](D:\网博学习资料\课堂笔记\笔记图片\ascii-2-1.png)



### 引用数据类型

String 字符串

```
String playName = scan.next();
String fistman = "null"；
```

### 变量名

####   规范

​    1、必须是**英文单词**

​    2、必须见名知意  --- 配合字典，切忌使用拼音

​    3、**首字母**必须**小写**，多个单词采用**驼峰式命名**

​      例子：name  age   studentName  teacherName

​    4、不要使用**关键字**



### 变量的使用

```
int a = 18;
int b;
b = 18;
```

```
int i , j;
```

变量先声明后赋值的话，在赋值之前该变量不可用

#### 变量动态赋值

从控制台（键盘）输入获取值赋给一个变量。利用函数`Scanner`

```
Scanner scan = new Scanner(System.*in*);
```



### 注释

提高代码可读性

一般来说，注释占比 **20%~30%**

####   分为三类：

（1）类注释(可以用在类上、属性上、方法上)

```
/**
*
*/
```

（2）单行注释

```
//
```

（3）多行注释

```
/*

*/
```



##  运算符

#### （1）赋值运算符

=    +=    -=    *=    /=    (%)=    <<=    >>=    &=    ^=    |=



#### （2）位运算符

&    |    ^    ~    <<    >>    >>>



#### （3）关系运算符

> > < > >= <= == !=
> >
> > 产生结果为Boolean类型



#### （4）算数运算符

$$
+    -    *    /    %    ++    --
$$



#### （5）自增自减运算符

```
i++    i--    ++i    --i
```

运算符在后，先运算再自增自减；运算符在前先自增自减再运算。



#### （6）逻辑运算符

&&    ||    !



#### （7）短路逻辑运算符

当使用与逻辑运算符时，在两个操作数都为true时，结果才为true，但是当得到第一个操作为false时，其结果就必定是false，这时候就不会再判断第二个操作了。



#### （8）条件运算符（?:）

条件运算符也被称为三元运算符。该运算符有3个操作数，并且需要判断布尔表达式的值。该运算符的主要是决定哪个值应该赋值给变量。

```
// 如果 a 等于 1 成立，则设置 b 为 20，否则为 30      b = (a == 1) ? 20 : 30;
```

```
variable x = (expression) ? value if true : value if false
```



#### （9）instanceof 运算符

该运算符用于操作对象实例，检查该对象是否是一个特定类型（类类型或接口类型）。

```
( Object reference variable ) instanceof  (class/interface type)
```



### **Java运算符优先级**

![image-20230714095546218](D:\网博学习资料\课堂笔记\笔记图片\image-20230714095546218.png)



### java条件语句（if）

```
(1)if(布尔表达式){
  //如果布尔表达式为true，将执行的语句
}

(2)if(){
}
else(){
}

(3)if(){
}
else if(){
}....
else(){
}
```

还有嵌套的用法

条件的写法：要么从小到大写，要么从大到小写（有时可以省略条件，有时不行）

```
if(salary >= 50){
    system. out.println( "买奔驰E");
    }else if(salary >= 30){
    system. out.println ( "买奥迪A4") ;
    }else if(salary >= 15){
    system. out.println ( "买比亚迪") ;
    }else{
    system. out.println ( "头BMW" );
}
```

### Java switch case 语句

```
switch(expression){    
    case value :       
    //语句       
    break; //可选    
    case value :       
    //语句       
    break; //可选    
    //你可以有任意数量的case语句    
    default : //可选       
    //语句 
    }
```

- switch 语句中的变量类型可以是： byte、short、int 或者 char。从 Java SE 7 开始，switch 支持字符串 String 类型了，同时 case 标签必须为字符串常量或字面量。
- case 语句中的值的数据类型必须与变量的数据类型相同，而且只能是常量或者字面常量。

- switch case 执行时，一定会先进行匹配，匹配成功返回当前 case 的值，再根据是否有 break，判断是否继续输出，或是跳出判断。

- default 分支不需要 break 语句。

  

### Java 循环结构

在一定条件满足时重复做某件事

- **while** （循环条件）{

  ​    循环体

  }

- **do…while** 循环    至少执行一次

- **for** 循环

  for(循环变量初始化;布尔表达式;循环变量变动)

  

####      break 关键字

- break 主要用在循环语句或者 switch 语句中，用来跳出整个语句块。

- break 跳出最里层的循环，并且继续执行该循环下面的语句。(if语句while语句中都可以使用)

​     

####      continue 关键字

- continue 适用于任何循环控制结构中。作用是**让程序立刻跳转到下一次循环的迭代。**

- 在 for 循环中，continue 语句使程序立即跳转到更新语句（循环判断，进入下一次循环）。

- 在 while 或者 do…while 循环中，程序立即跳转到布尔表达式的判断语句。



#### 考题

打印乘法口诀表



## Number & Math 类方法

- ```
  [xxxValue()]
  ```

将 Number 对象转换为xxx数据类型的值并返回。

![image-20230714155847367](D:\网博学习资料\课堂笔记\笔记图片\image-20230714155847367.png)

- compareTo()    将number对象与参数比较。

- `equals()`    判断number对象是否与参数相等。

- valueOf()    返回一个 Number 对象指定的内置数据类型

- toString()    以字符串形式返回值。

- parseInt()    将字符串解析为int类型。

- abs()    返回参数的绝对值。

- cell()    返回大于等于( >= )给定参数的的最小整数，类型为双精度浮点型。

- floor()    返回小于等于（<=）给定参数的最大整数 。

- rint()    返回与参数最接近的整数。返回类型为double。

- round()    它表示**四舍五入**，算法为 **Math.floor(x+0.5)**，即将原来的数字加上 0.5 后再向下取整，所以，Math.round(11.5) 的结果为12，Math.round(-11.5) 的结果为-11。

- min()    返回两个参数中的最小值。

- max()    返回两个参数中的最大值。

- exp()    返回自然数底数e的参数次方。

- log()    返回参数的自然数底数的对数值。

- `pow()`    返回第一个参数的第二个参数次方。

- sqrt()    求参数的算术平方根。

- sin()    求指定double类型参数的正弦值。

- cos()    求指定double类型参数的余弦值。

- tan()    求指定double类型参数的正切值。

- asin()    求指定double类型参数的反正弦值。

- acos()    求指定double类型参数的反余弦值。

- atan()    求指定double类型参数的反正切值。

- atan2()    将笛卡尔坐标转换为极坐标，并返回极坐标的角度值。

- toDegress()    将参数转化为角度。

- toRadians()    将角度转换为弧度。

- random()    返回一个随机数。

  

## Java Character类

对单个字符进行操作

在对象中包装一个char的值

```
char ch = 'a';  
```

// Unicode 字符表示形式 

```
char uniChar = '\u039A';   
```

// 字符数组 

```
char[] charArray ={ 'a', 'b', 'c', 'd', 'e' };
```

```
用Character的构造方法创建一个Character类对象
Character ch = new Character('a');
```

#### 转义序列

![image-20230715135414857](D:\网博学习资料\课堂笔记\笔记图片\image-20230715135414857.png)

#### Character 方法

- `isLetter()`是否是一个字母
- `isDigit（）`是否是一个数字字符

- `isWhitespace（）`是否是一个空白字符
- `isUpperCase()`是否是一个大写字母
- `isLowerCase()`是否是一个小写字母
- `toUpperCase()`指定字母的大写形式
- `toLowerCase()`指定字母的小写形式
- `toString()`返回字符的字符串形式，字符串长度仅为1





#### JavaScript test() 方法

test() 方法用于检测一个字符串是否匹配某个模式.

如果字符串中有**匹配的值**返回 true ，否则返回 false。



## Java String 类

#### 创建字符串

```
String str = "Runoob";
```

```
String str2 = new String("Runoob");
```

String 创建的字符串存储在公共池中，而 new 创建的字符串对象在堆上：

```
String s1 = "Runoob";              // String 直接创建
String s2 = "Runoob";              // String 直接创建
String s3 = s1;                    // 相同引用
String s4 = new String("Runoob");   // String 对象创建
String s5 = new String("Runoob");   // String 对象创建
```

new 创建的字符串对象在地址上并不一样，而直接创建的字符串地址是一样

String 类有 **11 种**构造方法

- 提供一个字符数组参数

String 类是不可改变的，所以你一旦创建了 String 对象，那它的**值**就无法改变了

#### 字符串长度

String 类的一个访问器方法是 length() 方法，它返回字符串对象包含的字符数。

```
String site = "www.runoob.com";
int len = site.length();//返回site字符串中的字符数
```

#### 连接字符串

```
string1.concat(string2);
```

更常用的是使用'+'操作符来连接字符串，如：

```
"Hello," + " VE" + "!"
```

#### 创建格式化字符串

String 类的静态方法 format() 能用来创建可复用的格式化字符串

```
String fs;
fs = String.format("浮点型变量的值为 " +
                   "%f, 整型变量的值为 " +
                   " %d, 字符串变量的值为 " +
                   " %s", floatVar, intVar, stringVar);
```

### String 方法（节选）

[菜鸟原帖](https://www.runoob.com/java/java-string.html)

- `char charAt(int index)`返回指定索引处的char值
- `int compareTo(Object o)`把这个字符串与另一个对象比较
- `boolean contentEquals(StringBuffer string1)`当且仅当字符串与指定的StringBuffer有相同顺序的字符时候返回真。
- `boolean equalsWith(Steing suffix)`测试此字符串是否以指定的后缀结束。
- `boolean equals(Object anObject)`将此字符串与指定的对象比较。
- `boolean equalsIgnoreCase(String anotherString)`将此 String 与另一个 String 比较，不考虑大小写。
- `void getChars(int srcBegin,int srcEnd,char[] dst,int dstBegin)`将字符从此字符串复制到目标字符数组
- `int indexOf(int ch)`返回指定字符在此字符串中第一次出现处的索引。
- `int length()`返回此字符串的长度
- `boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)`测试两个字符串区域是否相等。
- `String toLower()`使用默认语言环境的规则将此 String 中的所有字符都转换为小写。
- `String toLower()`使用默认语言环境的规则将此 String 中的所有字符都转换为大写。
- `contains(CharSequence chars)`判断是否包含指定的字符系列。
- `isEmpty()`判断字符串是否为空。



## Java StringBuffer 和 StringBuilder 类

当对字符串进行**修改**的时候，需要使用 StringBuffer 和 StringBuilder 类。

和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象*能够被多次的修改*，并且不产生新的未使用对象。

#### StringBuffer

​    Buffer:经常出现，代表的是缓冲区(内存中的一块区域)，缓冲区中操作数据的速度非常快,直接在内存中操作数据。

​    字符类型数组 char []



#### 两者之间的区别：

StringBuilder 类在 Java 5 中被提出，它和 StringBuffer 之间的最大不同在于 StringBuilder 的方法***不是线程安全***的（**不能同步访问**）。

由于 StringBuilder 相较于 StringBuffer 有*速度优势*，所以多数情况下建议使用 StringBuilder 类。

```
public class RunoobTest{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder(10);
        sb.append("Runoob..");
        System.out.println(sb);  
        sb.append("!");
        System.out.println(sb); 
        sb.insert(8, "Java");
        System.out.println(sb); 
        sb.delete(5,8);
        System.out.println(sb);  
    }
}
```

```
编译结果
Runoob..
Runoob..!
Runoob..Java!
RunooJava!
```

然而在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。

### StringBuffer 方法

常用方法：

![image-20230715150935943](D:\网博学习资料\课堂笔记\笔记图片\image-20230715150935943.png)

- int capacity()返回当前容量
- `char charAt(int index)`返回此序列中指定的索引处的char值。
- `int indexOf(String str)`返回第一次出现的指定子字符串在该字符串中的索引。
- `int indexOf(String str, int fromIndex)`从指定的索引处开始，返回第一次出现的指定子字符串在该字符串中的索引。
- `int lastIndexOf(String str, int fromIndex)`返回 String 对象中子字符串最后出现的位置。
- int length()返回长度（字符数）。
- `void setCharAt(int index, char ch）`将给定索引处的字符设置为 `ch`。





## Java 数组

数组：一组连续的区间

String数组实例化中第一项默认为”null“

int数组实例化中第一项默认为”0“

三种创建方式：

(1)先声明再实例化

```
String[] names;

names = new String[5]
```

（2）声明的同时给数组赋值，数组长度取决于数据的个数

```
String [] names = {"name1","name2","name3","name4"};
```





#### 创建数组

```
public class TestArray {
   public static void main(String[] args) {
      // 数组大小
      int size = 10;
      // 定义数组
      double[] myList = new double[size];
   }
}
```

#### For-Each 循环

```
public class TestArray {
   public static void main(String[] args) {
      double[] myList = {1.9, 2.9, 3.4, 3.5};
      // 打印所有数组元素
      for (double element: myList) {
         System.out.println(element);
      }
   }
}
```

```
编译结果：
1.9
2.9
3.4
3.5
```

数组可以作为函数的参数，也可以作为函数的返回值



### 多维数组

```
type[][] typeName = new type[typeLength1][typeLength2];

int[][] a = new int[2][3];
```

```
String[][] s = new String[2][];
s[0] = new String[2];
s[1] = new String[3];
s[0][0] = new String("Good");
s[0][1] = new String("Luck");
s[1][0] = new String("to");
s[1][1] = new String("you");
s[1][2] = new String("!");
```



#### Arrays 类

![image-20230715160051324](D:\网博学习资料\课堂笔记\笔记图片\image-20230715160051324.png)

```
Arrays.sort(Object a)
```

jdk封装的排序算法，按从小到大排序



#### 数组考题

给定一个整数数组,如:{26,12,47,9,11,32},按照如下格式输出：(中兴软创笔试题)

9  47  11  32  12  26

![image-20230717115619106](D:\网博学习资料\课堂笔记\笔记图片\image-20230717115619106.png)



## 面对对象

#### 面向过程：

符合人的思维方式

适合小型开发

不能并行开发

不具备团队性，团队协作差，代码维护性差

#### 概念

将一个复杂的问题模块化，，每个模块独立设计，独立生产最终将会具有联系在一起形成一个组织

#### 类和对象的关系

对象抽象出类

类实例化出对象

#### 设计类

类是程序中的最小单元

设计一个类：

1.给类起一个名字 名词性 单词+首字母大写+驼峰式命名

2.静态特征   属性



### 内存结构

#### 栈

（先进后出）入：a b c d出：d c b a

栈顶，栈底

入栈，出栈

#### JVM进程

.java ->编译->字节码文件->机器语言->class.文件

分成：

  方法区：通常储存类的字节码文件

  常量池：常量数据

  堆区：存放引用类型(对象)，储存方法区的方法的引用

  栈区：存储**方法**和**基本数据类型**，指向堆区的地址，运行时的临时数据

```
“y”.equals(isOK)   true

"y" == isOK        flase
```



### 专业术语

类：dog

对象：new Dog ,又称为实例

属性： 静态特征，又称成员属性，实例属性

方法： 动态特征，实例方法



## java 方法

方法的定义

方法是某一类中的成员，表示一种功能

方法的语法：

  访问修饰符 返回值类型  方法名（参数列表）{方法的具体实现}

- 访问修饰符： public，定义了该方法的访问类型

- 返回值类型：方法可能会返回值。ValueType（int String char boolean...） 是方法返回值的数据类型。有些方法执行所需的操作，但没有返回值。在这种情况下，ValueType 是关键字**void**。

- 方法名: 方法的实际名称 最好体现功能的意义

- 参数类型：当方法被调用时，传递值给参数。这个值被称为**实参**或变量。参数列表是指方法的参数类型、顺序和参数的个数。方法可以不包含任何参数。

- 方法体：具体的语句，定义该方法的功能。

  

main 方法是被 JVM 调用的，除此之外，main 方法和其它方法没什么区别。

方法内定义的变量被称为局部变量。作用范围从声明开始，直到包含它的块结束。



#### finalize() 方法

Java 允许定义这样的方法，它在对象被垃圾收集器析构(回收)之前调用，这个方法叫做 finalize( )，它用来清除回收对象。



#### 构造方法

与普通方法的区别：

1.没有返回值

2.方法名必须是类名

作用：

1.创建对象，在堆区开辟空间

2.给属性赋值

当一个类中不存在显式的构造方法时，则系统默认为其分配一个公共的无参构造方法

当一个类中存在显式的构造方法时，则系统不再为其分配类中默认的构造方法



#### this关键字

this：当前对象

通过this. 调用对象的属性和方法

this调用构造方法：

this（参数列表），并且只能放在第一行

（主要放在默认构造方法中）



#### 方法的重载

方法名一模一样，但方法的参数列表一定不一样

可变长度数组：

```
public void add(int ... numbers){

}
```



### 面对对象-封装（面对对象三大特征）

透明-----指不清楚内部

程序中的封装是一种隐藏

1.将属性私有化：

私有化后的属性只有内部类的成员才能访问

2.公共的setter和getter方法（可以自动生成）

3.在setter方法中加入控制语句



#### 开闭原则

开原则：对扩展开放，程序方便扩展功能。

闭原则：对修改封闭，当在修改代码时，尽量少修改，大量修改，风险性更大





## Java 继承（面对对象三大特征）

解决重复代码块的一种手段

#### 符合开闭原则：

-  对扩展开放
-  对修改封闭（少修改）

1.先抽取一个父类



私有的不能被继承

构造方法不能被继承

任何一个类祖先都是Object类，都有继承于Object的方法

打印一个对象就是调用该对象的toString方法，该方法继承于Object

Java不支持多继承，原因：

- 为了避免混淆不清的概念（假如多继承，那继承的同名方法调用目标标是哪个分不清楚）

缺点：

- 过多使用导致代码结构复杂

#### 访问修饰符

1.默认

不在同包下，默认的成员不能被继承

2.public 全部都能被继承或使用

3.protected 不同包且不是子类，其protected成员不能被继承

4.private 只有本类可以使用

![image-20230720111306394](D:\网博学习资料\课堂笔记\笔记图片\image-20230720111306394.png)



#### 子类初始化过程

在继承关系下

在实例化之前就执行：父类静态代码块，子类静态代码块（**在类加载到JVM的方法区的时候加载**）



先父类构造方法，再父类属性赋值

之后子类构造方法，再子类属性赋值



#### implements关键字

使用 implements 关键字可以变相的使java具有**多继承**的特性，使用范围为类继承接口的情况，可以同时继承多个接口（接口跟接口之间采用*逗号*分隔）。

```
public interface A {
    public void eat();
    public void sleep();
}

public interface B {
    public void show();
}

public class C implements A,B {
}
```



#### super 与 this 关键字

**super**关键字：我们可以通过super关键字来实现对*父类成员*的访问，用来引用当前对象的父类。

(1)super可以调用父类的构造方法

 `super(参数列表)`  必须放在**第一行**  

 

(2)super.属性名  父类的属性

 

(3)super.方法名  父类的方法

this关键字：指向自己的引用。



#### final 关键字

final 可以用来修饰：

- ***变量***（包括*类属性*、*对象属性*、*局部变量*和*形参*）

- **方法**（包括*类方法*和*对象方法*）

- **类**

final 含义为 "最终的"。

使用 final 关键字：

​    声明类，就是把类定义定义为*最终类*，*不能被继承*，目的是为防止父类方法被篡改

​    如果用于*修饰方法*，该方法可以被继承但不能被子类重写



#### static

用法：

1. 修饰一个代码块，**优先**到加载类文件的时候（自上而下依次加载）。在某个系统启动时，可以用static预先加载一些static静态代码，非static静态代码块不能被预加载

2. static修饰一个方法，叫类方法，通过`类.方法名`方式调用

3. 非static代码可以调用static代码块

4. static修饰属性叫类属性，类属性是所有该类的对象**共享的**。

   ​    static修饰的数据储存在**方法区**中

   ​    非static修饰的属性是实例属性，在内存中多一份对象多一份数据，在独立的空间中，互不干扰冲突。

5. 什么时候使用static？

     一般用于工具类和工具方法中，需要实例化的方法不需要用静态，如果一个数据只有一个值，则使用static，如Π（圆周率）、男、女

   ​    通常static现实的属性和final一起连用



#### 构造器

​    子类是不继承父类的**构造方法**的，它只是*调用*（*隐式或显式*）。如果父类的构造器**带有参数**，则必须在子类的构造器中***显式***地通过 **super** 关键字调用父类的构造器并配以适当的*参数列表*。或者在父类中补充一个无参的构造方法。

​    如果父类构造器*没有参数*，则在子类的构造器中*不需要*使用 **super** 关键字调用父类构造器，系统会自动调用（隐式调用）父类的无参构造器。



#### 重写与重载之间的区别

![image-20230720155841884](D:\网博学习资料\课堂笔记\笔记图片\image-20230720155841884.png)

重写要求：

- 访问级别不能比父类低
- 返回值类型必须和父类的一样，或父类返回值类型的子类
- 方法名必须和父类一样
- 参数列表一定不能修改，要跟父类一模一样

有需求就要重写



#### 抽象方法和抽象类

abstract：

- 抽象类中的抽象方法没有方法体，且抽象类不可被实例化

- 父类是抽象类时，子类能实现父类的抽象方法，则子类才能被实例化


- 如果子类不能实现父类的抽象方法，那么子类还是一个抽象类


一个类中有抽象方法，那么这个类一定是抽象类；但抽象类中不一定有抽象方法

构造方法，类方法（用 static 修饰的方法）不能声明为抽象方法。



**abstract可以用于隔离父类**，强制使用子类

考题：

​     抽象类和抽象方法的关系是什么？

- 任何子类必须重写父类的抽象方法，或者声明自身为抽象类。
- 如果一个类包含抽象方法，那么该类必须是抽象类。



## 多态（面对对象三大特征）

​    同一个事件发生在不同的对象上会产生不同的结果。

​    同一对象，条件不同，展现不同的形态

多态要求：

- 有继承关系
- 子类重写了父类的方法
- 子类对象赋给了父类，父类调用子类重写的方法
- 父类透明地调用子类的方法



优点：

1. 消除类型之间的耦合关系

2. 可替换性

3. 提高了程序可扩展性

4. 接口性

5. 灵活性

6. 简化性

7. 是解决方法内部重复代码的一种方法

   

多态实现方式：

1. 重写
2. 接口
3. 抽象类和抽象方法

误区注意：（笔试考点）

- **属性**不参与多态

- **类方法**（静态方法）不参与多态

  

设计代码时，最好面向父类设计，可以更好的使用多态

多态的变形：

- 从下往上，自动转型pet = dog
- 从上往下，强制类型转换dog = （Dog）pet

`dog instanceof Dog`对象是否一个类型的实例，返回对象是Boolean类型



#### 内部类

观察JDK底层的内部类

内部类概念：

​    在一个类内部再定义一个类

为了更好的封装

外部类如何访问内部类数据：

- 先实例化内部类对象，通过内部类对象调用内部类成员

内部类可以直接使用外部类的数据，而不需要实例化外部类的对象（平级概念）

如果内部类属性跟外部类冲突，则优先内部类同名属性



#### 匿名内部类

如果只是再某个位置临时使用，其他地方都不用，就没有必要增加一个Java文件，也没有必要起名字。就可以用匿名内部类。

`class A = new class(){}` 

没有名字是匿名类

优点：

- 不需要新增额外的类文件

缺点：

- 不能共用

## Java接口

​    接口，在JAVA编程语言中是一个*抽象类型*，是*抽象方法*的**集合**，接口通常以**interface**来声明。一个类通过继承接口的方式，从而来继承接口的抽象方法。

​    类描述对象的属性和方法。接口则包含类要实现的方法。

​    除非实现接口的类是抽象类，否则该类要定义接口中的所有方法。

接口的声明：

```
/* 文件名 : Animal.java */
interface Animal {
   public void eat();
   public void travel();
}
```

**implements关键字**（接口的实现关键字）

相当于继承

```
...implements 接口名称[, 其他接口名称, 其他接口名称..., ...] ...
```

```
/* 文件名 : MammalInt.java */
public class MammalInt implements Animal{

   public void eat(){
      System.out.println("Mammal eats");
   }

   public void travel(){
      System.out.println("Mammal travels");
   } 

   public int noOfLegs(){
      return 0;
   }

   public static void main(String args[]){
      MammalInt m = new MammalInt();
      m.eat();
      m.travel();
   }
}
```



#### 接口与类相似点

1. 一个接口能有多个**方法**
2. 接口文件保存在.Java结尾的文件中，文件名使用接口名。
3. 接口的字节码文件保存在.class结尾的文件中。
4. 接口相应的字节码文件必须在与包名称相匹配的目录结构中。

#### 接口与类的区别：

1. 接口不能用于实例化对象。
2. 接口没有构造方法
3. 接口中的所有方法都必须是抽象方法，但可用default关键字修饰非抽象方法。
4. 接口不能包含成员变量，除了static和final变量。
5. 接口不是被继承而是被实现。
6. 接口支持多继承



### 接口的特性

1. 接口中的每一个方法都是共有且隐式抽象的，接口中的方法会被隐式地指定为public abstract。

2. 接口中可以有变量，但是接口中的变量会被隐式地指定为**public static final变量**也就是公共的静态常量。

   对于静态常量的命名规范：

   - 全部大写，多个单词之间用_分割

3. 接口中的方法是不能在接口中实现的，只能由实现接口的类来实现接口中的方法。

4. 接口，没有构造方法，所以不能被实例化。

5. jdk1.8之后引入了静态方法和默认方法，这两种需要有方法体

结论：

- 接口中除了常量，静态、默认方法之外的所有方法都是抽象方法
- 在使用接口时，多态的特征发挥到淋漓尽致
- 优点：
  1. 先有标准，基础构架出来，后续只需按照标准实施即可。
  2. 接口可以更好地实现多态
  3. 程序的扩展性搞，具有可插拔性



#### 面向接口编程

如果使用继承，先面对父类设计

如果使用接口，优先考虑指定标准，有了标准后任意做实现，任意替换，使程序更加灵活多变

一个类实现多个接口，实现类的多继承

设计标准和能力优先考虑接口



#### 类的备份（需要实现cloneable接口）

没用任何内容的接口被称为标识接口

**创建对象的一种方式**：(加上前面的两种方法，应该已经有三种)

具体实例：

```
/**
 * 定义一个学生类，继承Object父类的克隆接口并实现它的功能
 */
public class Student implements Cloneable{
    private String name;
    private int ages;

    public Student() {
    }

    public Student(String name, int ages) {
        this.name = name;
        this.ages = ages;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ages=" + ages +
                '}';
    }
    //重写Object类的克隆方法，向下转型，需要强制类型转换
    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }
}
```

```
/**
 * 克隆接口重写实现对象的拷贝案例
 */
public class TestStudentClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student("wrz", 22);
        System.out.println(student);

        Student wrz = student.clone();
        System.out.println(wrz);
        student.setName("wjh");
        student.setAges(21);
        System.out.println(student);
    }
}
```

对象数组的排序方法（三种）

#### 接口默认方法

jdk1.8之前要增加能力的做法：

​    细粒度接口新增功能，实现类按需实现新增功能

jdk1.8之后要增加能力的做法：

​    `default 关键字` 默认方法

所有实现类默认继承，如不满足需求，实现类可重写默认方法，注意是public访问修饰符



#### 接口静态方法

`static 关键字`

注意：

​    静态方法尽量通过接口直接调用（接口名.静态方法），因为子类可能写有自己的跟接口重名的静态方法（可能出现想调用接口实现的静态方法却调用了子类自己定义的静态方法）。



## Java Lambda 表达式

Lambda 允许把函数作为一个方法的参数（函数作为参数传递进方法中）。

使用 Lambda 表达式可以使代码变的更加**简洁紧凑**。

```
(parameters参数列表) -> expression表达式
或
(parameters) ->{ statements; }
```

具体实现：

1. 得到一个匿名对象，内部做推理，什么样的接口就什么样的匿名对象
2. 对抽象方法的实现，内部的推理（参数列表）

特征：

- **可选类型声明：**不需要声明参数类型，编译器可以统一识别参数值。
- **可选的参数圆括号：**一个参数无需定义圆括号，但多个参数需要定义圆括号。
- **可选的大括号：**如果主体包含了一个语句，就不需要使用大括号。
- **可选的返回关键字：**如果主体只有一个表达式返回值则编译器会自动返回值，大括号需要指定表达式返回了一个数值。

*总结* 误区：

- lambda表达式只能用在接口中，有且只有一个抽象方法
- 如果接口中有@FunctionalInterface注解则可以使用lambda函数表达式

jdk中能使用lambda表达式的接口有很多：



## Java 常用类

#### Integer 类

基本数据类型 转换为 引用数据类型，被称为自动装箱

*引用数据类型* 转换为 *基本数据类型*,被称为自动拆箱

可以实现字符串类型转型为int型自动装箱



#### String 类

底层由字符数组构成

构造方法（ 种）

常用方法



- compareTo()方法

  ```
  String str03 = "wrzdpg";
          String str04 = "wrzdpgzd";
          System.out.println(str03.compareTo(str04));
  运行结果：
  -2
  ```

  返回值是整型，它是先比较对应字符的大小(ASCII码顺序)，如果第一个字符和参数的第一个字符不等，结束比较，返回他们之间的长度**差值**，如果第一个字符和参数的第一个字符相等，则以第二个字符和参数的第二个字符做比较，以此类推,直至比较的字符或被比较的字符有一方结束。

  - 如果参数字符串等于此字符串，则返回值 0；
  - 如果此字符串小于字符串参数，则返回一个小于 0 的值；
  - 如果此字符串大于字符串参数，则返回一个大于 0 的值。

- concat()方法

  将参数字符串接到该字符串后面，会产生新的字符串对象，当大量的字符做拼接时不建议使用这个方法

- contains（）方法

  该字符串存在参数字符串的时返回true

- endsWith（）方法

  检查该字符串是否以参数字符串结尾，返回值为boolean

- equals()方法

  比较该字符串是否与参数字符串相等

- indexOf（）方法

  返回参数的字符串值在该字符串的下标位置，如果该字符串中没有参数字符串存在，则返回-1

- isEmpty()方法

  返回该字符串是否为空的Boolean值

- lastIndexOf（）方法

  返回参数字符串在该字符串中最后出现的位置

- substring（）方法
  - 一个int参数,返回参数下标开始到该字符串最后的子字符串
  - 两个int参数，返回第一个参数开始第二个参数长度的子字符串

- toCharArray() 方法将字符串转换为字符数组

- toLowerCase()

- toLowerCase(Locale locale)

  通过本地规则将该字符串全部小写

- toUpperCase()

- toUpperCase(Locale locale)

  通过本地规则将该字符串全部大写

- trim() 方法用于删除字符串的头尾空白符

- split() 方法根据匹配给定的正则表达式来拆分字符串。

- matches()方法

  返回是否匹配的正则表达式规则的Boolean值

- replace()方法

  两个参数，第一个参数是旧的替换字符，第二个是新的替换字符



#### 正则表达式

[菜鸟正则表达式详解](https://www.runoob.com/java/java-regular-expressions.html)

正则表达式可以在文本中**查找**、替换、**提取**和验证特定的模式。

[ABC]：可以匹配到A、B、C

[^ABC]：可以匹配到除A、B、C以外的所有字符

 

[A-Z]：可以匹配到A和Z之间所有的字符，是[ABCDEFG…Z]的一种简约写法

 

**.  :任何一个字符**

**\s ：空格**

**\S :非空格**

**\w :匹配字母、数字、下划线  [a-zA-Z0-9_]**

**特殊字符**

$:结尾

^：开头

.  :单个

*: 任意个数  零个或多个

+:至少有一个

? : 0个或1个

{n} : 正好是n个

{n,}:最少n个

{n,m}:最少n个,最多m个

简单的正则表达式自己写，复杂的需求去抄



## Java 枚举(enum)

概念：

Java 枚举是一个特殊的类，一般表示一组**常量**，比如一年的 4 个季节，一年的 12 个月份，一个星期的 7 天，方向有东南西北等。

Java 枚举类使用 **enum 关键字**来定义，各个常量使用逗号 **,** 来分割。

```
enum Color 
{ 
    RED, GREEN, BLUE; 
} 

public class Test 
{ 
    // 执行输出结果
    public static void main(String[] args) 
    { 
        Color c1 = Color.RED; 
        System.out.println(c1); 
    } 
}
代码输出：
RED
```

- 枚举类也可以声明在内部类中

- 每个枚举都是通过 Class 在内部实现的，且所有的枚举值都是 **public static final** 的。（所有所有的枚举值都在类加载时就被初始化了）

  ![image-20230724200601190](D:\网博学习资料\课堂笔记\笔记图片\image-20230724200601190.png)

- 枚举类常应用于 switch 语句中

- 枚举跟普通类一样可以用自己的变量、方法和构造函数，构造函数只能使用 **private** 访问修饰符，所以外部无法调用。

- 枚举既可以包含具体方法，也可以包含抽象方法。 *如果枚举类具有抽象方法，则枚举类的每个实例都必须实现它。*

  

  

#### values(), ordinal() 和 valueOf() 方法

- values() 返回枚举类中所有的值。常用于构建枚举数组。
- ordinal()方法可以找到每个枚举常量的**索引**，就像数组索引一样。返回相应枚举值下标
- valueOf()方法返回指定**字符串值**的枚举常量。如果匹配就返回相应枚举值，负责则抛出异常。



#### System 类

包含几个有用的类、静态属性和静态方法，构造方法被私有化，所以它不能被实例化

- System.out  ：输出到控制台

- System.in : 从控制台接收输入

- System.arraycopy

- System.exit：  终止JVM

- System.currentTimeMillis:获取系统当前的时间  1970.1.1之间的差值



#### gc

​    垃圾回收器  

​    Java中，为对象分配空间---->系统自动分配

​     对象使用结束后，我们程序员并没有手动去释放内存，但是JVM后台有一个后台线程(“幕后”)---->GC 垃圾回收器  默默无闻的清除垃圾数据，不会实时清除，查看具体清除的策略。



#### object 类

![image-20230727145817115](D:\网博学习资料\课堂笔记\笔记图片\image-20230727145817115.png)

![image-20230727145838399](D:\网博学习资料\课堂笔记\笔记图片\image-20230727145838399.png)



## Java 包(package)

包的作用：

- 1、把功能相似或相关的类或接口组织在同一个包中，方便类的查找和使用。
- 2、如同文件夹一样，包也采用了*树形目录*的存储方式。同一个包中的类名字是不同的，不同的包中的类的名字是可以相同的，当同时调用两个不同包中相同类名的类时，应该加上包名加以区别。
- 3、包也限定了*访问权限*，拥有包访问权限的类才能访问某个包中的类。

Java 使用包（package）这种机制是为了防止**命名冲突**，**访问控制**，提供搜索和定位类（class）、接口、枚举（enumerations）和注释（annotation）等。





## 设计模式

*设计模式（Design pattern）代表了最佳的实践（生产过程中），通常被有经验的面向对象的软件开发人员所采用。设计模式是软件开发人员在软件开发过程中面临的**一般问题**的解决方案。这些解决方案是众多软件开发人员经过相当长的一段时间的试验和错误总结出来的。*

切记：不要为了使用设计模式而使用设计模式

#### 单例设计模式

在系统中遇到只有一个对象时，该类负责创建自己的对象，同时确保只有单个对象被创建。————>可以考虑使用单例设计模式

步骤：

1. 将构造方法私有化
2. 定义一个静态属性，在类的内部，采用构造方法实例化对象
3. 提供一个公共的静态方法返回实例对象

注意：

- 单例类只能有一个实例。
- 单例类必须自己创建自己的唯一实例。
- 单例类必须给所有其他对象提供这一实例。

考题：手写单例代码（2种）

1. 饿汉式
2. 懒汉式



#### 模板设计模式

概念：

​    一个抽象类公开定义了执行它的方法的方式/模板。它的子类可以**按需要**重写方法实现，但调用将以抽象类中定义的方式进行。这种类型的设计模式属于行为型模式。

目的：    

​    定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。

使用场景：

   1、有多个子类共有的方法，且逻辑相同。少量不同的客户化

   2、重要的、复杂的方法，可以考虑作为模板方法。

优点：

- 1、封装不变部分，扩展可变部分。 
- 2、提取公共代码，便于维护。
- 3、行为由父类控制，子类实现。

缺点：

- 每一个不同的实现都需要一个子类来实现，导致类的个数增加，使得系统更加庞大。

为防止恶意操作，一般模板方法都加上 final 关键词。

```
public abstract class Game {
   abstract void initialize();
   abstract void startPlay();
   abstract void endPlay();

   //模板
   public final void play(){

      //初始化游戏
      initialize();
     
      //开始游戏
      startPlay();
     
      //结束游戏
      endPlay();

   }
}
```



#### 装饰器设计模式

把某种动态功能实现，不能影响被装饰对象，可以动态实现功能增加





#### 单一原则

高内聚：

​    属于一个类本身的属性和方法，应该放在本类中

低耦合：

​     不属于一个类本身的属性和方法，尽量不要放在一起





## Java数据结构

主要包括以下几种接口和类：

- 枚举（Enumeration）
- 位集合（BitSet）
- 向量（Vector）
- 栈（Stack）
- 字典（Dictionary）
- 哈希表（Hashtable）
- 属性（Properties）



# Java集合框架

Collection 集合定义：

​    Collection 是最基本的集合接口，一个 Collection 代表一组 Object，即 Collection 的元素, Java不提供直接继承自Collection的类，只提供继承于的子接口(如List和set)。

Collection 接口存储一组不唯一，无序的对象。

- 大的容器
- 顶层接口，具体的实现靠子接口去实现和拓展

- 提供最基本于通用的方法与接口（标准）



List 接口

概念：

​    List接口是一个有序的 Collection，使用此接口能够精确的控制每个元素插入的位置，能够通过索引(元素在List中位置，类似于数组的下标)来访问List中的元素，第一个元素的索引为 0，而且允许有相同的元素。

特点：

List 接口存储一组不唯一，有序（插入顺序）的对象。



Set：

概念：

Set 具有与 Collection 完全一样的接口，只是行为上不同，Set 不保存重复的元素。

特点：

Set 接口存储一组唯一，无序的对象。







## Java ArrayList

概念：

ArrayList 类是一个可以**动态**修改的数组，连续空间（随机遍历，快速定位），与普通数组的区别就是它是没有固定大小的限制，我们可以插入或删除元素（数据越多，需操作的数据越多，所以效率低（跟数据大小成正比））。

在多态扩容时，会造成时间和空间上的损耗。（开空间，搬数据，多余空间）

ArrayList 继承了 AbstractList ，并实现了 List 接口。

语法格式

```
import java.util.ArrayList; // 引入 ArrayList 类

ArrayList<E> objectName =new ArrayList<>();　 // 初始化
```

- **E**: 泛型数据类型，用于设置 objectName 的数据类型，**只能为引用数据类型**。

```
import java.util.ArrayList;

public class RunoobTest {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites);
    }
}
```

添加元素：

`add()` 方法

```
sites.add("Google");
```

访问元素：

`get()` 方法

```
sites.get(1)
```

修改元素：

 `set()` 方法

```
sites.set(2, "Wiki"); // 第一个参数为索引位置，第二个为要修改的值
```

删除元素

remove() 方法

同名的元素删除只会删除一个，先删除最先储存的

```
sites.remove(3); // 删除第四个元素
```

返回数组大小：

 `size()` 方法

```
sites.size()
```

可以使用 for-each 来迭代元素：

```
for (String i : sites) {
            System.out.println(i);
        }
```

ArrayList 排序方法

```
Collections.sort(sites);  // 字母排序
```

一般为升序排序



Arrary.asList()方法 使数组转集合





#### Java ArrayList 方法

![image-20230725204734337](D:\网博学习资料\课堂笔记\笔记图片\image-20230725204734337.png)

![image-20230725204751714](D:\网博学习资料\课堂笔记\笔记图片\image-20230725204751714.png)

**以下情况使用 ArrayList :**

- 频繁访问列表中的某一个元素。
- 只需要在列表末尾进行添加和删除元素操作。
- 数据量少



## Java LinkedList

​     链表（LinkedList），还是一个线性表，但不会线性地储存数据，而是每个节点上储存下一个节点的地址

​     链表可分为 *单向链表* 和 *双向链表* 

  单向链表包含两个值: 当前节点的值和一个指向下一个节点的**链接**。

  一个双向链表有三个整数值: *数值*、*向后* 的节点链接、*向前* 的节点链接。

缺点：

1. 随机访问性差

#### 与 ArrayList 相比

共同点：

1. 都是面向接口编程，易于替换
1. 都是线性表
1. 都实现了相同功能、相同方法名的的方法
1. 各自都有属于自己的特殊方法，只有声明自生对象才能调用



不同点：

1. LinkedList的底层是链表，而ArrayList的底层是数组。
2. LinkedList 的增加和删除的操作效率更高，而查找和修改的操作效率较低。
3. LinkedList不会线性地储存数据
4. LinkedList与ArrayList在扩容时不一样，LinkedList是动态扩容每一个新增的数据，而ArrayList则是在容量不满足时直接把容量变为原来的1.5倍。



​     

**以下情况使用 LinkedList :**

- 你需要通过循环迭代来访问列表中的某些元素。
- 需要频繁的在列表开头、中间、末尾等位置进行添加和删除元素操作。



#### 常用方法：

![image-20230727093159567](D:\网博学习资料\课堂笔记\笔记图片\image-20230727093159567.png)

![image-20230727093236100](D:\网博学习资料\课堂笔记\笔记图片\image-20230727093236100.png)

![image-20230727093250465](D:\网博学习资料\课堂笔记\笔记图片\image-20230727093250465.png)



## stack

JDK自带的栈类型

拥有自生的特殊方法

## Vector

- Vector扩容是原来的2倍(多1倍)（导致扩容频率比较低，所以拷贝次数少，但是加上了线程锁）
- 方法都加了线程锁，所以占用相应的算量，实现线程安全
- 其他和ArrayList一样：
  - 都是对List的实现
  - 底层都是由数组实现


所以现在基本不用，但面试会问（相比之下用ArrayList）









## Java HashSet

此类实现了 *set接口*，默认容量16，

![image-20230731145839408](D:\网博学习资料\课堂笔记\笔记图片\image-20230731145839408.png)

加载因子为0.75：

​    当数组使用空间达到了0.75时就会进行扩容（75%）



​    往Set中储存数据，本质上是往Map中存储数据



当链表长度达到8时：

​    把链表转换为红黑树（hash值相同）



HashSet 基于 HashMap（数据结构） 来实现的，是一个：

- **不**允许有 *重复元素* 的集合。

- 是**无序**的，即不会记录插入的顺序。

- **不是** *线程安全* 的， 如果多个线程尝试同时修改 HashSet，则最终结果是不确定的。 必须在多线程访问时显式同步对 HashSet 的 *并发访问*。

- 允许有 null 值。



底层存储使用了：数组 + 链表 + 红黑树



***为什么是无序的？***

因为**Object中的HashCode ()方法返回的是JVM地址值**，所以自然是无序的。 如果是重写了HashCode ()方法的话，那么它会根据值大小来排列，但是不一定先加入集合的对象的哈希值就小，因为这是根据对象里面的数据算出来的，所以大小虽然是固定的，但是没算出来之前，我们不能判断出谁大谁小。 所以自然也是无序的。







#### TreeSet

​    能把存入的数据有序输出，如果是对象存储的话需要重新实现compareable接口或者实现比较器（lambda 表达式）

  其余与HashSet绝大部分一致



## Java HashMap

  **面试高概率**（为什么HashMap里的key值是不重复且唯一的？？？）

hash("张三")-->(n - 1)&hash...-->下标2

`tab[i =(n - 1) & hash])`

![image-20230731145600450](D:\网博学习资料\课堂笔记\笔记图片\image-20230731145600450.png)

​    HashMap 是一个散列表，它存储的内容是键值对(key-value)映射。

-   HashMap 实现了 **Map 接口**，根据键的 HashCode 值存储数据，具有很快的访问速度，最多允许一条记录的键为 null（**当记录为null时，默认在数组第一顺位**），*不支持线程同步*。
- 是无序的，即不会记录插入的顺序。
- 继承于AbstractMap，实现了 Map、Cloneable、java.io.Serializable 接口。

​    HashMap 的 key 与 value 类型 *可以相同也可以不同*，可以是字符串（String）类型的 key 和 value，也可以是整型（Integer）的 key 和字符串（String）类型的 value。

​    HashMap 中的元素实际上是对象，一些常见的基本类型可以使用它的包装类。

创建案例以及put()方法 -添加元素



**基本原理（面试会问！）**

- 默认初始容量为2的幂次方
- 默认加载因子为0.75
- ![image-20230731190907391](D:\网博学习资料\课堂笔记\笔记图片\image-20230731190907391.png)



#### hash算法核心思想：

f(x)  ----> y  其中x表示任意长度的输入  y是固定长度的输出

  x远远大于y  --->压缩思想

存在f(x1)  = y  f(x2) = y 且 x1 不等于x2  叫做Hash碰撞(冲突)，不可避免的



```
// 引入 HashMap 类      
import java.util.HashMap;

public class RunoobTest {
    public static void main(String[] args) {
        // 创建 HashMap 对象 Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        System.out.println(Sites);
    }
}
输出结果：
{1=Google, 2=Runoob, 3=Taobao, 4=Zhihu}
```

- `get(key)` 方法获取 key 对应的 value:
- `remove(key)` 方法删除 key 对应的键值对(key-value):
- `clear（）` 方法，删除所有键值对(key-value)
- `size()` 方法计算 HashMap 中的元素数量
- 可以使用 for-each 来迭代 HashMap 中的元素。

HashMap

![image-20230727185742378](D:\网博学习资料\课堂笔记\笔记图片\image-20230727185742378.png)

![image-20230727190215978](D:\网博学习资料\课堂笔记\笔记图片\image-20230727190215978.png)



#### HashMap遍历方法(3种)

```
Map<String, String> hashMap01 = new HashMap<>();
        hashMap01.put("wrz", "fatter!");
        hashMap01.put("wtx", "nttter!!");
        hashMap01.put("wjh", "mimang!!");
        hashMap01.put("tr", "ticker!!");
        System.out.println(hashMap01 + "\t大小为：" + hashMap01.size());
        System.out.println(hashMap01.get("wrz"));
        hashMap01.remove("tr");
        System.out.println(hashMap01.containsKey("tr"));
        System.out.println(hashMap01 + "\t大小为：" + hashMap01.size());
        Set<Map.Entry<String, String>> entrySet01 = hashMap01.entrySet();
        //不熟悉的遍历方法
        entrySet01.forEach((entry) -> System.out.print(entry.getKey() + "-->" + entry.getValue() + "\t"));
```



## HashTable

1. 实现了Map接口，加载因子为：0.75
2. 当value值为空时会抛出异常，当key值为null时会报错，因为它获得参数时直接调用.hashCode()。
3. 加锁



#### HashTable与HashMap的区别

- HashMap允许key、value为null  因为：  做了非null的控制，而HashTable都不允许
- 



基本不用



## Properties(属性集)

 底层为HashTable,所以它的表现为key-value非null，key值为一，储存无序   

​    对程序来讲：使程序变得灵活（例如：改程序的默认存储地址....）

针对于程序的外部配置文件

特点：

- 外部以文件的形式存在
- 文件的后缀名有严格的格式
- 一行只能做一项配置，且满足 key = value 的格式（名 = 值）

实例：

```
Properties properties = new Properties();
        properties.load(TestProperties.class.getClassLoader().getResourceAsStream("com/njwb/hash/student.properties"));
        //输出结果都是wangxishun
        String name = (String) properties.get("name");
        System.out.println(name);
        String name02 = properties.getProperty("name");
        System.out.println(name02);
        //读取int型的配置（String值转int型的方法）输出结果都是32
        int age = new Integer(properties.getProperty("age"));
        System.out.println(age);
        age = Integer.valueOf(properties.getProperty("age"));
        System.out.println(age);
        age = Integer.parseInt(properties.getProperty("age"));
        System.out.println(age);
        age = new Integer(properties.getProperty("age")).intValue();
        System.out.println(age);
```



#### Enumeration迭代器

```
Enumeration<String> enumeration = (Enumeration<String>) properties.propertyNames();
        while (enumeration.hasMoreElements()){
            String nameE = enumeration.nextElement();
            String value = properties.getProperty(nameE);
            System.out.println(nameE + "-->" + value);
```



## 异常

#### 异常的分类：

- **检查性（编译（checked））异常：**最具代表的检查性异常是用户错误或问题引起的异常，这是程序员无法预见的。例如要打开一个不存在文件时，一个异常就发生了，这些异常在编译时会**发出提醒**（报错）。
  - 所有的Exception及其直接子类（除RuntimeException以外）都是检查性异常。

- **运行时异常（RuntimeException及其子类）：** 运行时异常是可能被程序员避免的异常。与检查性异常相反，运行时异常 *可以在编译时被**忽略*** 。
  - 所有的RuntimeException及其子类都是运行时异常

- **错误：** 错误不是异常，而是脱离程序员控制的问题。错误在代码中通常被忽略。例如，当栈溢出时，一个错误就发生了，它们在编译也检查不到的。



异常分类的**指导作用**：

1. 调用者可以决定采用哪种方式来处理异常（try catch或throws）。

2. 对于多态重写要求增加：

   1. 重写的方法不能比父类throws检查性（编译时）异常抛出更多,但是比父类多出运行时异常是可以的
   2. 父类如果有检查性（编译时）异常标签，那在具体实现类中也要在类上throws出该异常标签
   3. 子类如果重写了父类的方法并声明了异常声明（编译时）标签，那么父类和具体实现类上都要throws出该异常声明标签

   
   
   

![image-20230731171239511](D:\网博学习资料\课堂笔记\笔记图片\image-20230731171239511.png)

![image-20230731171256054](D:\网博学习资料\课堂笔记\笔记图片\image-20230731171256054.png)



####  try 和 catch 关键字

可以捕获异常。try/catch 代码块放在异常可能发生的地方。 

```
try
{
   // 程序代码
}catch(ExceptionName 异常对象)
{
   //Catch 块（异常处理方案）
}
//程序代码2
```

正常情况：程序代码 --> 程序代码2

异常情况：try中出现异常，try之后的代码就不会执行，由异常处理机制接管工作，直接跳转到异常处理方案中，最后执行代码块2

catch的形式：

1. 使用最大的异常来兜底（Exception e），最大的异常要写在**最下方**。

2. 使用多catch的方式来具体处理异常。

3. 有多个catch的时候，它会**自上而下**地查找与之匹配的异常，匹配的话进行新对应的处理，直到最终由JVM统一处理。

   

#### finally 关键字

无论如何都会被执行，除非程序被（虚拟机）提前被终止

`System.exit(1);`

`try finally`常用于终止某些无论如何（不管是否异常）必须被终止的资源

![image-20230801111039207](D:\网博学习资料\课堂笔记\笔记图片\image-20230801111039207.png)

#### throw 关键字

```
throw new RintimeException("健康值必须在1~10之间")
```

如果类内部抛出一个检查时异常时，我们的方法签名上需要添加一个throws标签做声明

调用者必须try catch 或继续向上声明，否者编译出错

一般throw new 运行时异常

#### throws 关键字

![image-20230801111113372](D:\网博学习资料\课堂笔记\笔记图片\image-20230801111113372.png)

异常声明标签（类异常标签）

如果在设计一个功能时候，明知道此功能可能存在问题，首要做的事情：对外声明

使用者看到了声明，做相应的处理方案。

![image-20230801111135125](D:\网博学习资料\课堂笔记\笔记图片\image-20230801111135125.png)



#### 堆栈信息

异常对象中的两个方法：

1. `getMessage()`:获取异常描述信息
2. `printStackTrace()`:输出堆栈信息

指导意义：

可以帮我们**精准定位异常的抛出点**

1. 当程序出现异常时，借助堆栈信息，精准找到目标点
2. 当程序不出现异常，但是结果和预期不一样，debug



#### 自定义异常

NullPointerException 原因：对象没有实例化或对象等于null

如果你需要的异常JDK中没有提供（这样的异常常常由实际的应用出现）

​    就必须要程序员自己定义-->自定义异常



## Java Iterator（迭代器）

是Java集合框架中的一种机制，用于遍历集合的接口

Iterator是Java迭代器最简单的实现，ListIterator是COllection API中的接口，它拓展了Iterator接口

迭代器接口定义了几个最常用的方法：

- **next()** - 返回迭代器的下一个元素，并将迭代器的指针移到下一个位置。
- **hasNext()** - 用于判断集合中是否还有下一个元素可以访问。
- **remove()** - 从集合中删除迭代器最后访问的元素（可选操作）。



## Java泛型

泛型提供了编译时类型安全检测机制，该机制允许程序员在编译时检测到非法的类型。

检查数据类型，免除数据强转

所有集合框架必须加上泛型

一般作用在：

1. 类上，泛型类
2. 接口上，泛型接口

#### 泛型方法

定义泛型方法的规则：

- 所有泛型方法声明都有一个类型参数声明部分（由尖括号分隔），该类型参数声明部分在方法返回类型之前（在下面例子中的 **<E>**）。
- 每一个类型参数声明部分包含一个或多个类型参数，参数间用逗号隔开。一个泛型参数，也被称为一个类型变量，是用于指定一个泛型类型名称的标识符。
- 类型参数能被用来声明返回值类型，并且能作为泛型方法得到的实际参数类型的占位符。
- 泛型方法体的声明和其他方法一样。注意类型参数只能代表引用型类型，不能是原始类型（像 **int、double、char** 等）。

​    但是如果是用了了强制类型转换导入了非泛型数据，还是不会检查出错误，但运行时会报错

如以下代码：

```
List<Integer> intList = new ArrayList<Integer>();
intList.add(Integer.*valueOf*("a"));
System.*out*.println("链表已储存数据数量：" + intList.size());
```

java 中泛型标记符：

- **E** - Element (在集合中使用，因为集合中存放的是元素)
- **T** - Type（Java 类）
- **K** - Key（键）
- **V** - Value（值）
- **N** - Number（数值类型）
- **？** - 表示不确定的 java 类型



#### 泛型类

```
public class Box<T> {
   
  private T t;
 
  public void add(T t) {
    this.t = t;
  }
 
  public T get() {
    return t;
  }
 
  public static void main(String[] args) {
    Box<Integer> integerBox = new Box<Integer>();
    Box<String> stringBox = new Box<String>();
 
    integerBox.add(new Integer(10));
    stringBox.add(new String("菜鸟教程"));
 
    System.out.printf("整型值为 :%d\n\n", integerBox.get());
    System.out.printf("字符串为 :%s\n", stringBox.get());
  }
}
```

#### 类型通配符

```
import java.util.*;
 
public class GenericTest {
     
    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();
        
        name.add("icon");
        age.add(18);
        number.add(314);
 
        getData(name);
        getData(age);
        getData(number);
       
   }
 
   public static void getData(List<?> data) {
      System.out.println("data :" + data.get(0));
   }
}
输出结果
data :icon
data :18
data :314

```

#### 泛型接口

泛型接口可以很好地解决上次--接受不同类型的数据和引用对象，通过比较相应的数据大小进行排序，各类型实现各类型的接口来实现所需要的需求



## 日志

将程序中的关键信息储存下来：

- 什么时间？ -->当前系统时间
- 发生了什么操作？ -->类中的某个方法
- 参数的数据是什么？ -->方法中的参数 手机号 银行卡号 额度...
- 异常信息？ -->getMessage getErrorCode getErrorMsg printStackTarce

如何实现日志：

1. 自己封装一个日志工具（费时费力，面对对象特征---直接用别人的封装）

2. 第三方日志工具

   我们这里使用`log4j`



#### 第三方组件的公共使用方法：

1. 准备第三方的jar包（储存的都是.class字节码文件，可以直接运行）
2. 配置文件
   1. 导入jar包（我们一般创建一个名为“lib”的目录，专门来存放第三方的jar文件）
   2. jar文件拷贝到“lib”目录
   3. 配置jar包，使当前程序（可细化到模块）可用
3. 配置log4j
   1. 必须在src根目录下定义名为log4j.properties
   2. 按照其配置手册配置



注意：

该属性集（外部配置文件只能放在/src目录下，否则Logger类和其方法的调用会报错，显示为没有正确的初始化）



log4j有五个方法：

1. debug（）：测试 开发阶段
2. info（）  正常信息
3. warn（）  警告信息
4. error（） 错误信息  在异常中
5. fatal（） 致命的信息



#### 实例代码：

```
Logger logger = Logger.getLogger(TestMain.class);
try {
            dog.setHP(20);
        }catch (petException e){
            System.out.println(e.getMessage());
            logger.debug(e.getMessage());
            System.out.println("错误代码：" + e.getErrorCode() + "-->" + e.getMessage());
            logger.info("错误代码：" + e.getErrorCode() + "-->" + e.getMessage());
            e.printStackTrace();
            logger.warn(e.getStackTrace());
        }


        try{
            dog.setSex("双性人");
        }catch (petException s){
            System.out.println(s.getMessage());
            logger.debug(s.getMessage());
            System.out.println("错误代码：" + s.getErrorCode() + "-->" + s.getErrorMsg());
            logger.info("错误代码：" + s.getErrorCode() + "-->" + s.getErrorMsg());
            s.printStackTrace();
            logger.warn(s.getStackTrace());
        }
```



#### 日志级别

debug < info < warn < error < fatal

开发阶段 使用debug（）

商用阶段 使用info（）





## Java 流(Stream)、文件(File)和IO

输入流：将外部数据读取到程序中来

输出流：将程序中的数据写出到外部中

抽象根类

`InputStream`字节输入流的根类

`OutputStream`字节输出流的根类

`Reader`字符输入流的根类

`Writer`字符输出流的根类

![image-20230801170424542](D:\网博学习资料\课堂笔记\笔记图片\image-20230801170424542.png)





#### File

```
File wrzxixiFile = new File("D:/program/test/wrzxixi");
        System.out.println("目标是否存在：" + wrzxixiFile.exists());
        System.out.println("目标是否为文件夹：" + wrzxixiFile.isDirectory());
        System.out.println("文件夹名称为：" + wrzxixiFile.getName());
        System.out.println("文件夹目录路径为：" + wrzxixiFile.getPath());
        System.out.println("文件目录的上一级目录为："  + wrzxixiFile.getParent());

        File testFile = new File("D:/program/test");
//        test目录下有哪些子文件（2种）方法
        //通过该方法输出的为该目录下的各个文件和文件目录的名称
        String [] files = testFile.list();
        for (String f : files) {
            System.out.print(f + "\t");
        }
        System.out.println();
        
        //        调用File类的.listFiles()方法把目标目录的所有子目录和文件都导入一个File[]数组里
        //通过这种方法输出的是该目录下的各个文件和目录的路径
        File [] files02 = testFile.listFiles();
        for (File f : files02) {
            System.out.println(f + "\t");
        }
        
        //文件过滤器FileFilter
        //该方法可以使用lambda表达式
        //过滤出该目录下的所有文件
        File [] fileFilter = testFile.listFiles((f) -> f.isFile());
        System.out.println("过滤出该目录下的所有文件：");
        for (File f : fileFilter) {
            System.out.println(f + "\t");
        }
        System.out.println("过滤出该目录下的所有文件目录：");
        File [] fileFilter2 = testFile.listFiles((f) -> f.isDirectory());
        for (File f : fileFilter2) {
            System.out.println(f + "\t");
        }
        
        //另一种过滤方法
        File [] fileFilter3 = testFile.listFiles();
        for (File f : fileFilter3) {
            if (f.isFile()){
                System.out.println("为文件：" + f);
            }
        }
        for (File f : fileFilter3) {
            if (f.isDirectory()){
                System.out.println("为文件目录：" + f);
            }
        }
```



#### FileInputStream

文件中的底层储存是字节



#### FileOutputStream





#### ByteAttaryInputStream和ByteAttaryOutputStream

具体代码案例

```
InputStream in = null;
        OutputStream out = null;
        //创建一个数据源字节数组（String 字符串转换为字节数组）
        byte [] bytes = "wrzxixihaha".getBytes();
        byte [] sourceDatas = "wtxntntjiushicreay".getBytes();
        //把输入流的源给参数目标字节数组
        in = new ByteArrayInputStream(bytes);
        //声明字节数组输出流对象
        out = new ByteArrayOutputStream();
        
        //ByteArrayInputStream(bytes)流程
        try {
            //这里声明输入流或输出流一次性读入或输出多少个字节
            byte [] datas = new byte[2];
            
            //调用的in.read()方法在参数数据没有输出值时返回-1
            //在这里声明一个判断字节数组里是否还有字节的变量length
            int length = in.read(datas);
            while(length !=-1){
                //输出输入流读取的字节数据
                //实例化一个新的String对象，第二个参数和第三个参数是为了防止一次性读取多个字节时，最后一次的读取不满足一次读取所需要的字节数，规定其的最后一次读取
                
                System.out.print(new String(datas, 0, length));
                length = in.read(datas);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println();
        //ByteArrayOutputStream()流程
        
        try {
            out.write(sourceDatas, 0, sourceDatas.length);
            //强制输出剩余的缓存数据
            out.flush();
            //输出输出流所输出的数据
            System.out.println(new String(out.toString()));
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                out.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        //假设数据量非常大
        //输入流输出流一起使用
        //流被关闭时，如果流对象被重新赋值，依然可以被使用

        byte [] muchDatas = "wjhwrzwtxbbbbbbbbbigerrrrrppppigpgasdw".getBytes();
        in = new ByteArrayInputStream(muchDatas);
        out = new ByteArrayOutputStream();
        //一次性读入4个字节的数据
        byte [] onceDatas = new byte[4];
        int length = 0;
        try {
        //用in控制语句判断
            while ((length = in.read(onceDatas)) != -1){
            //用输出流进行数据的输出
                out.write(onceDatas, 0, length);
                out.flush();
            }
            System.out.println(out);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                out.close();
                in.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
```



#### FileReader/FileWriter

![image-20230802194235498](D:\网博学习资料\课堂笔记\笔记图片\image-20230802194235498.png)

```
//FileReader流代码实现功能
        //一个一个字符输出
        try {
            FileReader fr = new FileReader(f1);
            int length = fr.read();
            while (length != -1){
                System.out.print((char)length + "\t");
                length = fr.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch (IOException e){
            e.printStackTrace();
        }
```

```
//FileReader流代码实现功能
        //多个字符输出
        try {
            FileReader fr = new FileReader(f1);
            char [] datas = new char[4];
            int length = fr.read(datas);

            while (length != -1){
                System.out.print(new String(datas， 0， length) + "\t");
                length = fr.read(datas);
            }
            //关闭流
            fr.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch (IOException e){
            e.printStackTrace();
        }
```

![image-20230802194624416](D:\网博学习资料\课堂笔记\笔记图片\image-20230802194624416.png)







#### 读取控制台输入

Java 的控制台输入由 System.in 完成。

为了获得一个绑定到控制台的字符流，你可以把 System.in 包装在一个 BufferedReader 对象中来创建一个字符流。

下面是创建 BufferedReader 的基本语法：

```
BufferedReader br = new BufferedReader(new 
                      InputStreamReader(System.in));
```

#### 从控制台读取多字符输入

从 BufferedReader 对象读取一个字符要使用 read() 方法，它的语法如下：

```
int read( ) throws IOException
```

用 read() 方法从控制台不断读取字符直到用户输入 **q**。

//使用 BufferedReader 在控制台读取字符

```
import java.io.*;

public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        // 读取字符
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
```



#### 从控制台读取字符串

从标准输入读取一个字符串需要使用 BufferedReader 的 readLine() 方法。

```
//使用 BufferedReader 在控制台读取字符
import java.io.*;
 
public class BRReadLines {
    public static void main(String[] args) throws IOException {
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("end"));
    }
}
```



#### 流的分类：

按数据类型：

按照流向：
是否和储存介质直接关联：



高级流或包装流





## Java 序列化

*了解*

​    Java 提供了一种对象序列化的机制，该机制中，一个对象可以被表示为一个字节序列，该字节序列包括该**对象**的**数据**、有关对象的 类型 的信息和存储在对象中 *数据的类型*。

​    将序列化对象写入文件之后，可以从文件中读取出来，并且对它进行反序列化，也就是说，对象的类型信息、对象的数据，还有对象中的数据类型可以用来在内存中新建对象。

​    整个过程都是 Java 虚拟机（JVM）独立的，也就是说， *在一个平台上序列化的对象可以在另一个完全不同的平台上反序列化该对象。*



一个类的对象要想序列化成功，必须满足两个条件：

1. 该类必须实现 java.io.Serializable 接口。
2. 该类的所有属性必须是可序列化的。如果有一个属性不是可序列化的，则该属性必须注明是短暂的。



```
public final void writeObject(Object x) throws IOException
```

上面的方法序列化一个对象，并将它发送到输出流。



```
public final Object readObject() throws IOException, 
                                 ClassNotFoundException
```

该方法从流中取出下一个对象，并将对象反序列化。



#### ObjectOutputStream 类

用来序列化一个对象



 当序列化一个对象到文件时， 按照 Java 的标准约定是给文件一个 .ser 扩展名。



Tans





## 多线程

程序：代码、指令的集合，是一个静态的概念



进程：

- 将程序运行起来，就是一个进程

- 系统会为其分配**CPU、内存**等资源

- 进程与进程之间通信需通过IP或端口等进行交换内存空间，交互成本高

  



线程：

- 是进程中实际运作的单位，负责**具体做事**。
- 一个进程至少有一个线程，当有多个线程时线程与线程之间相互独立，又互相独立。
- 线程运行中所需要 的内存是共享进程中的内存，CPU实际上是在指挥线程
- 线程与线程之间的通信容易且高效（同一地址空间）



现代软件基本都是多线程软件，多线程程序可以提高运行效率（充分地使用了CPU资源）



#### 线程同步问题

  在多线程中：每个线程都有自己独立的栈区，各自操作各自的数据空间

  采用接口的方式实现线程，更能容易地实现数据的共享

  造成数据不安全的根本原因：多个线程同时对一份数据发生修改操作，从而造成线程不安全（线程同步问题）问题

所以我们使用锁机制：

- 牺牲了效率，保证了数据的修改安全





#### 线程的基本实现



##### 并行、串行

并行：多线程并行运行，彼此之间互不冲突

串行：单线程运行



##### 三种实现方式：（面试要问：线程的实现方式有几种？<3>）

1. **extends Thread**
   1. 定义一个线程类  extends  Thread
   2. 重写run方法
   3. 利用Thread的start方法启动线程

2. **implements** **Runnable**
   1. 定义一个类，实现Runnable接口
   2. 重写run方法的线程体
   3. 交给Thread类负责启动线程

3. **implements Callable**

   前两种的实现：run方法没有返回值，故不能直接获取线程的执行结果（但是implements Callable实现接口可以直接返回执行结果）

   1. 定义一个类 实现Callable接口，并且指定返回值类型
   2. 重写call方法线程体，相当于run方法
   3. 启动线程



#### extends Thread  和 implements Runnable有什么区别？

1. 类单根继承，接口可以多继承，接口的扩展性更高

2. 启动方式不一样,继承Thread，可以直接利用Thread中的start方法启动线程

    实现Runnable接口，不能直接启动线程，必须委托Thread类才能启动

你会选择哪个？:

​    接口，面向接口编程，**扩展性高**，且可以使用Lambda表达式，代码**更简洁**。



#### 常用方法

- `sleep(int i)` 方法 暂停执行，释放CPU，一般用来做延时操作
- `yied()` 方法 暂时放弃CPU的占用，然后立马可以再次获取CPU
  - 和sleep之间的区别：
    - sleep必须睡醒之后(除非被打断)才能获取CPU
- `join()` 方法当一个线程加入到另一个线程时，优先执行该线程，直到该线程执行完毕后才执行其他线程
- `stop()` 终止线程，该方法不安全，所以被弃用。替代方案：标识位
- `isAlive()` 返回线程是否还在运行的boolean值
- `setDeamon()` 
  - 线程分为用户线程和保护线程
    - 用户线程：面向用户
    - 保护线程：支持用户线程的功能 
- `set/getPriority(int priority)` ：更改线程的优先级。
  - 优先级越大，线程获得CPU的使用权的几率越大。都是不一定，收到操作系统的影响
