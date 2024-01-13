package com.itany.corejava.code07_面向对象.封装;

/**
 * @author MissChen
 * @version 1.0
 * @date 2024年01月11日 13:33
 */

// 存在两个类:Poker(一副牌)、Card(一张牌)
// Card中有两个属性:num(点数)、color(花色)
// Poker中有一个属性:Card[]
// 每副牌存在54张牌，四种花色A-K,加上大小王
// 需求一:定义Poker的构造方法，为一副牌去填充54张牌
public class TestPoker {
    public static void main(String[] args) {
        Poker poker=new Poker();
        Card[] cards=poker.getCards();
        System.out.println(cards.length);
        for(Card card:cards){
            System.out.print(card.getColor()+card.getNum()+" ");
        }

    }
}
