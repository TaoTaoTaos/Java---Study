package oop2;

public class Account {
    private String name;
    private double money;

    //===================================================

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //====================================================================
    public void setMoney(double money) {
        if (money > 0) {
            this.money = money;
        } else {
            System.out.println("设置金额需要大于0");
        }

    }

    public double getMoney() {
        return money;
    }
    //====================================================================


    //transfer用于：把某人的钱转给调用者。
    public void Steal(Account name, double money) {
        this.money += money;
        name.money -= money;
        System.out.println("================窃取==============");
        System.out.println(this.getName() + " 把 " + name.getName() + "的" + money + " 元偷给了自己 ");
        System.out.println("偷钱之后：");
        System.out.println(this.getName() + "现在有 " + this.getMoney() + " 元");
        System.out.println(name.getName() + "现在有 " + name.getMoney() + " 元");
        System.out.println("================窃取==============");

    }
    //====================================================================

    public void give(Account name, double money) {
        this.money = this.money - money;
        name.money = name.money + money;
        System.out.println("=======================================");
        System.out.println(this.getName() + " 把 " + money + " 元转给了 " + name.getName());
        System.out.println("=======================================");
    }

    public void show() {
        System.out.println("=======================================");
        System.out.println(this.getName() + " 的余额为： " + this.getMoney());
        System.out.println("=======================================");
    }


}
