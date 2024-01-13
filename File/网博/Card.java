package com.itany.corejava.code07_面向对象.封装;

/**
 * @author MissChen
 * @version 1.0
 * @date 2024年01月11日 13:33
 */
// Card(一张牌)
// Card中有2个属性:num(点数)、color(花色)
public class Card {
    private String color;
    private String num;
    public Card(String color,String num){
        this.color=color;
        this.num=num;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setNum(String num){
        this.num=num;
    }
    public String getNum(){
        return num;
    }

}
