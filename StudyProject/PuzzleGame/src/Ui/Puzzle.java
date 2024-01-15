package Ui;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Puzzle extends JFrame implements MouseListener {

    private Puzzle[][] puzzles;//由于拼图要知道 自己 与 相邻的拼图 的位置关系，所有每块拼图都记录着当前的 拼图布局。
    private final int number;//拼图编号
    private int sign;//拼图标识 ： 0 代表普通拼图 ， 1 代表空白的那块特殊拼图
    private int init_x_location;//拼图初始 x 坐标
    private int init_y_location;//拼图初始 y 坐标

    private int x_location;//实时 x 坐标
    private int y_location;//实时 y 坐标
    private ImageIcon image;//拼图图片

    private Puzzle self;
    private JLabel label;


    public Puzzle(int number, int init_x_location, int init_y_location, ImageIcon image, JLabel label) {
        this.number = number;
        this.init_x_location = init_x_location;
        this.init_y_location = init_y_location;
        this.image = image;
        this.label = label;
        this.self = this;
        this.label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                //点击后执行动作==========================================================================

                Puzzle leftPuzzle = null, rightPuzzle = null, upPuzzle = null, downPuzzle = null;//初始化上下左右都是空的

                //注意：x，y坐标是从1，1开始
                //      数组坐标是从0,0开始
                if (y_location > 1) {//列数 大于 1 才有 左
                    leftPuzzle = puzzles[x_location - 1][y_location - 2];
                }
                if (y_location < 3) {//列数 小于 3 才有右
                    rightPuzzle = puzzles[x_location - 1][y_location];
                }
                if (x_location > 1) {//行数 大于 1 才有 上
                    upPuzzle = puzzles[x_location - 2][y_location - 1];
                }
                if (x_location < 3) {//行数 小于 3 才有 下
                    downPuzzle = puzzles[x_location][y_location - 1];
                }

                //被点击拼图显示信息
                System.out.println("=================================");
                System.out.println("编号： " + number + " 的拼图被点击");
                System.out.println("标志： " + sign);
                System.out.println("初始坐标   ：" + init_x_location + " ， " + init_y_location);
                System.out.println("目前的坐标为：" + x_location + " ， " + y_location);
                System.out.println("———————————————————");
                //打印相邻拼图的信息
                if (upPuzzle != null) {
                    System.out.println("上边拼图的编号 ：" + upPuzzle.number);
                }
                if (downPuzzle != null) {
                    System.out.println("下边拼图的编号 ：" + downPuzzle.number);
                }
                if (leftPuzzle != null) {
                    System.out.println("左边拼图的编号 ：" + leftPuzzle.number);
                }
                if (rightPuzzle != null) {
                    System.out.println("右边拼图的编号 ：" + rightPuzzle.number);
                }
                System.out.println("=================================");

                if (leftPuzzle != null && leftPuzzle.sign == 1) {
                    swapPuzzles(self, leftPuzzle);
                }
                if (rightPuzzle != null && rightPuzzle.sign == 1) {
                    swapPuzzles(self, rightPuzzle);
                }
                if (upPuzzle != null && upPuzzle.sign == 1) {
                    swapPuzzles(self, upPuzzle);
                }
                if (downPuzzle != null && downPuzzle.sign == 1) {
                    swapPuzzles(self, downPuzzle);
                }

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
        });
    }

    public int getX_location() {
        return x_location;
    }

    public Puzzle[][] getPuzzles() {
        return puzzles;
    }

    public void setPuzzles(Puzzle[][] puzzles) {
        this.puzzles = puzzles;
    }

    public void setX_location(int x_location) {
        this.x_location = x_location;
    }

    public int getY_location() {
        return y_location;
    }

    public void setY_location(int y_location) {
        this.y_location = y_location;
    }

    public int getSign() {
        return sign;
    }

    public void setSign(int sign) {
        this.sign = sign;
    }

    public int getNumber() {
        return number;
    }

    public int getInit_x_location() {
        return init_x_location;
    }

    public void setInit_x_location(int init_x_location) {
        this.init_x_location = init_x_location;
    }

    public int getInit_y_location() {
        return init_y_location;
    }

    public void setInit_y_location(int init_y_location) {
        this.init_y_location = init_y_location;
    }


    public ImageIcon getImage() {
        return image;
    }


    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public void show() {
        System.out.println("===============================================");
        System.out.println("拼图编号：" + this.getNumber());
        System.out.println("拼图标识：" + this.getSign());
        System.out.println("拼图x坐标：" + this.getInit_x_location());
        System.out.println("拼图y坐标：" + this.getInit_y_location());
        System.out.println("（" + this.getInit_x_location() + " ， " + this.getInit_y_location() + "）");
        System.out.println("拼图图片：" + this.getImage());
        System.out.println("拼图容器：" + this.getLabel());
        System.out.println("===============================================");
    }


    private void swapPuzzles(Puzzle p1, Puzzle p2) {
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

    }

    //===========================================================================================================
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
}
