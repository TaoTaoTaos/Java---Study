package Fight;

public class Fight {

    public static void main(String[] args) {
        //角色创建（用构造方法）
        Role role1 = new Role("王天旭", 100);
        Role role2 = new Role("小明", 100);


        System.out.println("=====================");
        System.out.println("角色展示：");
        role1.show();
        role2.show();
        System.out.println("=====================");

        System.out.println("开始战斗");
        while (role1.getBlood() > 0 && role2.getBlood() > 0) {


            role2.attack(role1);
            role1.attack(role2);

            role1.show();
            role2.show();

        }


    }
}
