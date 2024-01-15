package Ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class BaseUi extends JFrame implements MouseListener, ActionListener {

    // All_puzzles：
    //一个 3*3 的二维数组， 存放所有拼图的【布局】
    //数组里全是 Puzzle

    private Puzzle[][] All_puzzles = new Puzzle[3][3];


    //PATH数组，用来存储图片路径
    public String[] PATHS = {
            "C:\\Users\\Lijintao\\Desktop\\Java - Study\\StudyProject\\Day15-1.15_PuzzleGame\\Pictrue\\400x400\\",
            "C:\\Users\\Lijintao\\Desktop\\Java - Study\\StudyProject\\Day15-1.15_PuzzleGame\\Pictrue\\0_400x400\\"
    };

    //mode代表图片
    public int mode;

    public BaseUi() {

        initFace();//初始化界面
        mode = 0;//默认选第一张图片
        initPuzzle(PATHS[mode]);//初始化拼图
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
                All_puzzles[i][j].setY_location(j + 1);//拼图的 现在的位置 就是  初始位置


                All_puzzles[i][j].getLabel().setBounds(1 + (134 * j), 134 * i, 134, 134);

                if (num == 9) {
                    All_puzzles[i][j].setSign(1); //其中第 9 张 标识为 “1” 代表特殊的空白拼图
                } else {
                    All_puzzles[i][j].setSign(0);
                }

                All_puzzles[i][j].getLabel().setBorder(new BevelBorder(BevelBorder.RAISED));//每块拼图加个边框

                this.add(All_puzzles[i][j].getLabel());
                All_puzzles[i][j].show_puzzle(); //生成 puzzles 时 ，puzzle 【i，j】会展示一次自己的信息
            }
        }
        //把初始化好的拼图信息存入每块拼图
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                All_puzzles[i][j].setPuzzles(All_puzzles);
            }
        }
    }

    private void JMenuBar() {
        JMenuBar jMenuBar = new JMenuBar();//大菜单


        JMenu jMenu1 = new JMenu("功能");//第一个选项
        JMenu jMenu2 = new JMenu("关于我");//第二个选项


        JMenuItem random_1 = new JMenuItem("打乱拼图");//选项 里的 条目1
        JMenuItem nextP_2 = new JMenuItem("更换图片");    //条目2
        JMenuItem Restart_3 = new JMenuItem("重新开始");    //条目3

        //条目1 绑定事件
        random_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击了打乱拼图按钮");
                Random_Puzzle(All_puzzles);//打乱拼图数组元素
            }
        });

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

                // 更新界面
                revalidate();
                repaint();

            }
        });
        Restart_3.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                System.out.println("点击了重新开始按钮");
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
        });

        jMenu1.add(random_1);//把 条目1 加到第一个选项
        jMenu1.add(nextP_2);//把 条目2 加到第一个选项
        jMenu1.add(Restart_3);//把 条目3 加到第一个选项

        jMenuBar.add(jMenu1);//把 第一个选项 加到 大菜单
        jMenuBar.add(jMenu2);//把 第二个选项 加到 大菜单

        this.setJMenuBar(jMenuBar);//把上面的东西 设置给 【Ui】
    }


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
        this.setSize(419, 463);
        this.setLocationRelativeTo(null);//居中
        this.setResizable(false);//不可变大小
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//设置关闭模式


    }//初始化界面设置

    public void Random_Puzzle(Puzzle[][] puzzles) {//用于打乱二维数组里的拼图元素
        Random mr = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int x = mr.nextInt(3);
                int y = mr.nextInt(3);

                Puzzle tempPuzzle = puzzles[i][j];
                puzzles[i][j] = puzzles[x][y];
                puzzles[x][y] = tempPuzzle;
            }
        }
        //写入 现在 的坐标
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                puzzles[i][j].setX_location(i + 1);
                puzzles[i][j].setY_location(j + 1);
            }
        }
        //把现在的拼图布局 给 每一块 拼图
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                puzzles[i][j].setPuzzles(puzzles);
            }
        }
        for (int i = 0; i < 3; i++)//重新绘制 （setBound）
        {
            for (int j = 0; j < 3; j++) {
                All_puzzles[i][j].getLabel().setBounds(1 + (134 * j), 134 * i, 134, 134);
                add(All_puzzles[i][j].getLabel());
            }
        }
        System.out.println("拼图数组已打乱");
    }  //打乱【布局数组】


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
}

