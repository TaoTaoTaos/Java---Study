package Ui;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Puzzle extends JFrame implements MouseListener {
    private final int number;//拼图编号
    private int sign;//拼图标识 ： 0 代表普通拼图 ， 1 代表空白的那块特殊拼图
    private int x_location;//拼图 x 坐标
    private int y_location;//拼图 y 坐标
    private final ImageIcon image;//拼图图片

    private JLabel label;


    public Puzzle(int number, int x_location, int y_location, ImageIcon image, JLabel label) {
        this.number = number;
        this.x_location = x_location;
        this.y_location = y_location;
        this.image = image;
        this.label = label;
        this.label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(x_location + " ， " + y_location + "被点击");

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

    public int getSign() {
        return sign;
    }

    public void setSign(int sign) {
        this.sign = sign;
    }

    public int getNumber() {
        return number;
    }

    public int getX_location() {
        return x_location;
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
        System.out.println("拼图x坐标：" + this.getX_location());
        System.out.println("拼图y坐标：" + this.getY_location());
        System.out.println("（" + this.getX_location() + " ， " + this.getY_location() + "）");
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
