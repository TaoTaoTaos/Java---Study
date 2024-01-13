package Poker;

public class Card {
    private String num;// 牌号
    private String suit;//花色
    private int no;//牌的编号

    public Card(String suit, String num, int no) {
        this.num = num;
        this.suit = suit;
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }


    public void Card_show() {
        String formattedNo = String.format("%02d", this.no);
        System.out.println("┌────────────┐");
        System.out.println("| " + this.suit + "          |");
        System.out.println("|            |");
        System.out.println("|     " + this.num + "     |");
        System.out.println("|    No." + formattedNo + "   |");
        System.out.println("|            |");
        System.out.println("|          " + this.suit + " |");
        System.out.println("└────────────┘");
    }
}

