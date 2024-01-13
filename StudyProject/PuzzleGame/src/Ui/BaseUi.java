package Ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class BaseUi extends JFrame implements MouseListener, ActionListener {


    private Puzzle[][] All_puzzles = new Puzzle[3][3];

    /* All_puzzles：
    一个 3*3 的二维数组， 存放所有拼图
    数组里全是 Puzzle */

    public Puzzle[][] getAll_puzzles() {
        return All_puzzles;
    }

    public void setAll_puzzles(Puzzle[][] all_puzzles) {
        All_puzzles = all_puzzles;
    }

    public BaseUi() {

        initFace();//初始化界面
        initPuzzle();//初始化拼图
        JMenuBar();//基础界面的菜单栏

        this.setVisible(true);//设置可见


    }

    private void initPuzzle() {

        //初始化 9 张拼图 ，其中第 9 张 是空白拼图
        int num = 0;//拼图编号
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                ImageIcon image = new ImageIcon("C:\\Users\\Lijintao\\Desktop\\Java - Study\\StudyProject\\PuzzleGame\\Pictrue\\400x400\\" + (++num) + ".jpg");

                JLabel label = new JLabel(image);

                All_puzzles[i][j] = new Puzzle(num, i + 1, j + 1, image, label);

                All_puzzles[i][j].getLabel().setBounds(1 + (134 * j), 134 * i, 134, 134);

                if (num == 9) {
                    All_puzzles[i][j].setSign(1); //其中第 9 张 标识为 “1” 代表特殊的空白拼图
                } else {
                    All_puzzles[i][j].setSign(0);
                }

                this.add(All_puzzles[i][j].getLabel());

                All_puzzles[i][j].show(); //生成 puzzles 时 ，puzzle 【i，j】会展示一次自己的信息
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
                System.out.println("item1被点了");

                Random_Puzzle(All_puzzles);//打乱拼图数组元素

                for (int i = 0; i < 3; i++)//重新绘制 （setBound）
                {
                    for (int j = 0; j < 3; j++) {
                        All_puzzles[i][j].getLabel().setBounds(1 + (134 * j), 134 * i, 134, 134);
                        add(All_puzzles[i][j].getLabel());
                    }
                }
            }
        });

        jMenu1.add(random_1);//把 条目1 加到第一个选项
        jMenu1.add(nextP_2);//把 条目2 加到第一个选项
        jMenu1.add(Restart_3);//把 条目3 加到第一个选项

        jMenuBar.add(jMenu1);//把 第一个选项 加到 大菜单
        jMenuBar.add(jMenu2);//把 第二个选项 加到 大菜单

        this.setJMenuBar(jMenuBar);//把上面的东西 设置给 this
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


    }

    public boolean IsCloseStar(Puzzle puzzle1, Puzzle puzzle2) {
        if (puzzle1.getX_location() - puzzle2.getX_location() == 1 && puzzle1.getY_location() - puzzle2.getY_location() == 1
                && (puzzle1.getSign() == 1 || puzzle2.getSign() == 1)) {
            return true;
        } else {
            return false;
        }
    }

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
}

