package com.itany.corejava.code07_面向对象.封装;

/**
 * @author MissChen
 * @version 1.0
 * @date 2024年01月11日 13:33
 */

// Poker中有一个属性:Card[]
// 每副牌存在54张牌，四种花色A-K，加上大小王
public class Poker {
    private Card[] cards;
    public void setCards(Card[] cards){
        this.cards=cards;
    }
    public Card[] getCards(){
        return cards;
    }

    /**
     * 定义Poker的构造方法，为一副牌填充54张牌
     */
    public Poker(){
        //定义一副牌有54张牌
        cards=new Card[54];

        //定义每张牌的花色值的范围
        String[] colors={"黑桃","红桃","方块","梅花"};

        //定义每张牌的点数范围
        String[] nums={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

        //定义cards的初始下标，下标从0开始
        int index=0;

        //通过双重for循环，为每一张牌设置值
        // 每一种花色都与每一种点数进行组合
        for(int i=0;i<colors.length;i++){//外层循环控制花色
            for(int j=0;j<nums.length;j++){//内层循环控制点数
                cards[index++]=new Card(colors[i],nums[j]);
            }
        }

        //初此之外，每副牌都有大小王
        cards[index++]=new Card("大","王");
        cards[index++]=new Card("小","王");
    }
}
