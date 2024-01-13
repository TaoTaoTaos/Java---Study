package Fight;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    //===================================================
    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
        //构造方法
    }

    //==================================================
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attack(Role rolex) {
        if (this.getBlood() > 0) {
            Random mkr = new Random();
            int hurt;
            hurt = mkr.nextInt(20);
            rolex.blood = rolex.blood - hurt;
            if (rolex.blood < 0) {
                rolex.blood = 0;
            }

            System.out.println(" 【" + this.getName() + "】 " +
                    "打了 【" + rolex.getName() + " 】" + hurt + " 点血 ");

            if (this.getBlood() == 0) {
                System.out.println("=============================================");
                System.out.println(this.getName() + " 被 【" + rolex.getName() + "】 打死了");
                System.out.println("=============================================");
            }
            if (rolex.getBlood() == 0) {
                System.out.println("=============================================");
                System.out.println(rolex.getName() + " 被 【" + this.getName() + "】 打死了");
                System.out.println("=============================================");
            }
        }
    }

    public void show() {
        System.out.println("角色：" + getName());
        System.out.println("剩余血量： " + getBlood());
    }
}
