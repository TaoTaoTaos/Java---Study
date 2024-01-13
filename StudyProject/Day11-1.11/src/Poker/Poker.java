package Poker;

import java.util.Objects;
import java.util.Random;

public class Poker
        //一副牌
{
    public Card[] cards;//牌
    private int number;//牌的数量


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Poker(int x) {

        this.setNumber(x);
        Card[] cards1 = new Card[x];//生成牌组

        for (int i = 0; i < x; i++)
        //初始化牌组
        {
            cards1[i] = new Card("x", " x", i + 1);
        }
        //塞进 x 张无效牌
        this.cards = cards1;

    }

    public void Poker_ShowAll()//展示这副牌的所有牌
    {

        int count = 0;
        System.out.println("这是一副有 " + number + " 张牌的扑克");
        for (Card card : this.cards) {
            if (Objects.equals(card.getSuit(), "x")) {
                count++;
            }
            card.Card_show();

        }
        int num = number - count;
        System.out.println("=========================");
        System.out.println("展示完毕");
        System.out.println("共计 " + this.cards.length + " 张");
        System.out.println("其中有" + count + "张无效牌");
        System.out.println("      " + num + " 张有效牌");
        System.out.println("=========================");

    }


    public void Poker_Add(Card[] cards, int x) {
        //塞进 x 张有效牌 到 cards

        String[] suit = {"♠", "♥", "■", "♣"};
        String[] num = {" A", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", "10", " J", " Q", " K"};
        int index = 0;
        if (index < x) {
            for (String s : suit) {
                for (String n : num) {
                    cards[index++] = new Card(s, n, index);
                }
            }
        }
        //生成后要传进去
        this.cards = cards;
    }


    public void R_choose() //随机抽牌
    {
        Random mr = new Random();
        int x = mr.nextInt(this.number);
        this.cards[x].Card_show();
    }

}

