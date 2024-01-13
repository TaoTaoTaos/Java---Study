package oop;


public class GirlFriendsTest {
    public static void main(String[] args) {
        GirlFriends girl1 = new GirlFriends();

        girl1.setAge(18);
        girl1.setName("小明");
        girl1.setSex("Girl");
        girl1.setCharacter("温柔");

        System.out.println(girl1.getAge());
        System.out.println(girl1.getSex());
        System.out.println(girl1.getName());

        girl1.talk();

        girl1.eat();
        girl1.sleep();

    }
}