package oop;

import java.util.Random;

public class GirlFriends {

    private String name;
    private String sex;
    private String character;
    private int age;
    //成员属性


    //成员方法

    public void GR_GirlFriend() {
        String[] names = {"Alice", "Betty", "Cindy", "Daisy", "Eva"};
        String[] characters = {"善良", "活泼", "聪明", "勇敢", "温柔", "渣女"};
        int minAge = 18;
        int maxAge = 50;

        Random random = new Random();

        setName(names[random.nextInt(names.length)]);
        setSex("女");
        setCharacter(characters[random.nextInt(characters.length)]);
        setAge(random.nextInt(maxAge - minAge) + minAge);
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getCharacter() {
        return character;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age < 50) {
            this.age = age;
        } else {
            System.out.println("年龄不对");
        }
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    void sleep() {
        System.out.println("Sleeping...");
    }

    void eat() {
        System.out.println("Eating...");
    }

    void talk() {
        System.out.println("========================");
        System.out.print("Hello ~  ");
        System.out.println("My Name Is: " + name);
        System.out.println("My Age Is: " + age);
        System.out.println("My Sex Is: " + sex);
        System.out.println("My Character Is: " + character);
        System.out.println("========================");
    }


}

