package Ui;

import javax.swing.*;
import java.awt.*;

public class Puzzle {
    private int number;//拼图编号
    private Dimension location;//拼图坐标
    private ImageIcon image;//拼图图片

    public Puzzle(int number, Dimension location, ImageIcon image) {
        this.number = number;
        this.location = location;
        this.image = image;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Dimension getLocation() {
        return location;
    }

    public void setLocation(Dimension location) {
        this.location = location;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }


}
