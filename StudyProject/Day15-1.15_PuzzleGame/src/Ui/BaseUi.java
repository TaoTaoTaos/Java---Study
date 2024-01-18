package Ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.event.KeyListener;
import java.awt.EventQueue;


public class BaseUi extends JFrame implements MouseListener, ActionListener, KeyListener {


    private final Puzzle[][] All_puzzles = new Puzzle[3][3];    // All_puzzles：一个 3*3 的二维数组， 存放所有拼图的【布局】，数组里全是 Puzzle

    public String[] PATHS = {//PATH数组，用来存储图片路径
            "C:\\Users\\Lijintao\\Desktop\\Java - Study\\StudyProject\\Day15-1.15_PuzzleGame\\Pictrue\\400x400\\",
            "C:\\Users\\Lijintao\\Desktop\\Java - Study\\StudyProject\\Day15-1.15_PuzzleGame\\Pictrue\\0_400x400\\"
    };
    public int mode;  //mode代表图片0,1,2...

    JLabel all = new JLabel(new ImageIcon("C:\\Users\\Lijintao\\Desktop\\Java - Study\\StudyProject\\Day15-1.15_PuzzleGame\\Pictrue\\400x400\\all1.jpg"));

    //=====================================================================================
    public BaseUi() {

        initFace();//初始化界面
        mode = 0;//默认选第一张图片
        initPuzzle(PATHS[mode]);//初始化拼图（mode1）
        Random_Puzzle(All_puzzles);

        JMenuBar();//基础界面的菜单栏

        this.setVisible(true);//设置可见


    }

    private void initPuzzle(String s) {

        //初始化 9 张拼图 ，其中第 9 张 是空白拼图

        int num = 0;//拼图编号
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {


                ImageIcon image = new ImageIcon(s + (++num) + ".jpg");

                JLabel label = new JLabel(image);

                All_puzzles[i][j] = new Puzzle(num, i + 1, j + 1, image, label);//初始化所有拼图

                All_puzzles[i][j].setX_location(i + 1);
                All_puzzles[i][j].setY_location(j + 1);//拼图的 现在的位置 就是  【初始位置】


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


    }  //初始化 9 张拼图

    private void JMenuBar() {
        JMenuBar jMenuBar = new JMenuBar();//大菜单


        JMenu jMenu1 = new JMenu("功能");//第一个选项
        JMenu jMenu2 = new JMenu("关于我");//第二个选项


        JMenuItem random_1 = new JMenuItem("重新打乱");//选项 里的 条目1
        JMenuItem nextP_2 = new JMenuItem("更换图片");    //条目2
        JMenuItem Restart_3 = new JMenuItem("复原图片");    //条目3


        random_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击了打乱拼图按钮");
                Random_Puzzle(All_puzzles);//打乱拼图数组元素
            }
        });//条目1 事件
        nextP_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击了更换图片按钮");
                //要把 label 先删除了
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        remove(All_puzzles[i][j].getLabel());
                    }
                }

                //切换图片mode
                if (mode == 1) {
                    mode = 0;
                } else if (mode == 0) {
                    mode = 1;
                }

                // 初始化新的拼图
                initPuzzle(PATHS[mode]);
                Random_Puzzle(All_puzzles);
                // 更新界面
                revalidate();
                repaint();

            }
        }); //条目2 事件

        Restart_3.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                System.out.println("点击了复原图片按钮");
                //要把 label 先删除了
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        remove(All_puzzles[i][j].getLabel());
                    }
                }
                // 初始化新的拼图
                initPuzzle(PATHS[mode]);

                // 更新界面
                revalidate();
                repaint();
            }
        });//条目3 事件

        jMenu1.add(random_1);//把 条目1 加到第一个选项
        jMenu1.add(nextP_2);//把 条目2 加到第一个选项
        jMenu1.add(Restart_3);//把 条目3 加到第一个选项

        jMenuBar.add(jMenu1);//把 第一个选项 加到 大菜单
        jMenuBar.add(jMenu2);//把 第二个选项 加到 大菜单

        this.setJMenuBar(jMenuBar);//把上面的东西 设置给 【Ui】
    }//菜单按钮设置

    private void initFace() {

        //this.setUndecorated(true);//把标题栏隐藏

        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int width = screenSize.width;
        int high = screenSize.height;
        System.out.println("用户的显示器大小： " + width + "x" + high);//获取用户显示器大小
        this.setLayout(null);
        this.setVisible(true);
        this.setAlwaysOnTop(false);//置顶
        this.setTitle("小游戏");
        //this.setSize(1000, 1000);
        this.setSize(419, 463);
        this.setLocationRelativeTo(null);//居中
        this.setResizable(false);//不可变大小
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//设置关闭模式
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int code = e.getKeyCode();
                if (code == 65) {
                    System.out.println("A被按下");
                    //清除所有拼图 label
                    for (int i = 0; i < 3; i++) {
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

            @Override
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
        });


    }//初始化界面设置


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
                        //     【数组】坐标是从0,0开始

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

    private void Reprint(Puzzle[][] puzzles) {
        for (int i = 0; i < puzzles.length; i++)//重新绘制 （setBound）
        {
            for (int j = 0; j < puzzles[0].length; j++) {
                All_puzzles[i][j].getLabel().setBounds(1 + (134 * j), 134 * i, 134, 134);
                add(All_puzzles[i][j].getLabel());
            }
        }
    }

    public void swapPuzzles(Puzzle p1, Puzzle p2, Puzzle[][] puzzles) {

        // 交换拼图 的 【实时位置】
        int tempX = p1.getX_location();
        int tempY = p1.getY_location();
        p1.setX_location(p2.getX_location());
        p1.setY_location(p2.getY_location());
        p2.setX_location(tempX);
        p2.setY_location(tempY);

        // 交换拼图 的 【数组位置】
        puzzles[p1.getX_location() - 1][p1.getY_location() - 1] = p1;
        puzzles[p2.getX_location() - 1][p2.getY_location() - 1] = p2;

        //交换 拼图 的 label 的 bound ，即交换 【显示位置】
        p1.getLabel().setBounds(1 + (134 * (p1.getY_location() - 1)), 134 * (p1.getX_location() - 1), 134, 134);
        p2.getLabel().setBounds(1 + (134 * (p2.getY_location() - 1)), 134 * (p2.getX_location() - 1), 134, 134);

    }

    //=====================================================================================
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {


    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

