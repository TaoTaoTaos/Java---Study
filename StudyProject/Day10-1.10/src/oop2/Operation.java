package oop2;

public class Operation {
    public static void main(String[] args) {

        Account user1 = new Account();
        Account user2 = new Account();

        user1.setName("王天旭");
        user2.setName("王家豪");

        user1.setMoney(1000);
        user2.setMoney(1001);

        user1.Steal(user2, 50);
        //user1 偷了 user2 50块钱

        user1.give(user2, 1);
        //user1 给了 user2 1块钱
        user1.show();
        user2.show();
    }
}
