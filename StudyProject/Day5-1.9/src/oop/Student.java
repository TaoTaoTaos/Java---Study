package oop;

import java.util.Random;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String major;
    private String classNo;
    private GirlFriends girlfriend;

    //=============================================================
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public void talk() {
        System.out.println("================================");
        System.out.println("你好，这是我的信息");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Major: " + getMajor());
        System.out.println("Class Number: " + getClassNo());
        System.out.println("================================");
        System.out.println();
    }

    public void setGirlfriend(GirlFriends girlfriend) {
        this.girlfriend = girlfriend;
    }

    public void eat() {
        System.out.println("Eating !!");
    }

    public GirlFriends getGirlfriend() {
        return girlfriend;
    }

    public void sleep() {
        System.out.println("Sleeping en en en...");
    }

    public void ask() {
        if (girlfriend != null) {
            System.out.println("================================");
            System.out.println("你好你好，我是 " + getName());
            System.out.println("这是我的女朋友：" + girlfriend.getName());
            System.out.println("来介绍下自己吧" + girlfriend.getName());
            girlfriend.talk();
            System.out.println("================================");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("我现在没有女朋友...");
            System.out.println();
        }
    }


    public void GR_Student() {
        String[] names = {"张三", "李四", "王五", "赵六", "孙七"};
        String[] genders = {"男", "女"};
        String[] majors = {"计算机科学", "物理", "数学", "化学", "生物"};
        String[] classNos = {"一班", "二班", "三班", "四班", "五班"};

        Random random = new Random();

        setName(names[random.nextInt(names.length)]);
        setAge(random.nextInt(10) + 18); // 假设学生年龄在18到27岁之间
        setGender(genders[random.nextInt(genders.length)]);
        setMajor(majors[random.nextInt(majors.length)]);
        setClassNo(classNos[random.nextInt(classNos.length)]);

    }

    public void date() {
        if (girlfriend != null) {
            System.out.println("================================");
            System.out.println("我和我的女朋友 " + girlfriend.getName() + " 有个约会。");
            System.out.println("我们一起吃饭：");
            eat();
            girlfriend.eat();
            System.out.println("然后我们一起睡觉：");
            sleep();
            girlfriend.sleep();
            System.out.println("================================");
            System.out.println();
        } else {
            System.out.println("我现在没有女朋友，所以不能约会。");
        }
    }
}

