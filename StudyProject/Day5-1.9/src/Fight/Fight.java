package Fight;

public class Fight {

    public static void main(String[] args) {
        Role role1 = new Role();
        role1.setName("王天旭");
        role1.setBlood(100);

        Role role2 = new Role();
        role2.setName("小明");
        role2.setBlood(100);

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
