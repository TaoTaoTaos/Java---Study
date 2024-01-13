package Ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class BaseUi extends JFrame implements KeyListener {

    public BaseUi() {

        initFace();//初始化界面
        initImage();//初始化图片
        JMenuBar();//基础界面的菜单栏


        this.setVisible(true);//可见
    }

    private void initImage() {
        int num = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ImageIcon image = new ImageIcon("C:\\Users\\Lijintao\\Desktop\\Java - Study\\StudyProject\\PuzzleGame\\Pictrue\\400x400\\" + (num++) + ".jpg");
                JLabel Label = new JLabel(image);//创建一个JLabel 用来管理图片
                Label.setBounds(1 + (134 * j), 134 * i, 134, 134);
                this.add(Label);
            }
        }
    }

    private void JMenuBar() {
        JMenuBar jMenuBar = new JMenuBar();//大菜单


        JMenu jMenu1 = new JMenu("功能");//第一个选项
        JMenu jMenu2 = new JMenu("关于我");//第二个选项


        JMenuItem replay_1 = new JMenuItem("重新开始");//选项 里的 条目1

        JMenuItem nextP_2 = new JMenuItem("更换图片");    //条目2


        jMenu1.add(replay_1);//把 条目1 加到第一个选项
        jMenu1.add(nextP_2);//把 条目2 加到第一个选项

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
        this.addKeyListener(this);

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

