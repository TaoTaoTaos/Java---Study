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
    private final ImageIcon image;//拼图图片

    private JLabel label;


    public Puzzle(int number, int init_x_location, int init_y_location, ImageIcon image, JLabel label) {
        this.number = number;
        this.init_x_location = init_x_location;
        this.init_y_location = init_y_location;
        this.image = image;
        this.label = label;
        this.label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //被点击拼图显示信息
                System.out.println("===================");
                System.out.println("编号：" + number);
                System.out.println("初始坐标：" + init_x_location + " ， " + init_y_location + "的拼图被点击");
                System.out.println("目前的坐标为：" + x_location + " ， " + y_location);
                System.out.println("标志：" + sign);
                System.out.println("===================");

                //被点击拼图执行动作


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
