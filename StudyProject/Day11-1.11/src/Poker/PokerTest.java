package Poker;

public class PokerTest {
    public static void main(String[] args) {

        Poker poker1 = new Poker(54);//生成一副 poker1 并 自动初始化牌库
        poker1.Poker_ShowAll();

        System.out.println("======================================================");

        poker1.Poker_Add(poker1.cards, 20);
        poker1.Poker_ShowAll();

        System.out.println("======================================================");
        System.out.println("随便抽一张：");
        poker1.R_choose();
    }
}
