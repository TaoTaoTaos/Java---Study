package oop;

public class StudentTest {
    public static void main(String[] args) {
        Student studentTest = new Student();


//=========================================================student空
        System.out.println();

        System.out.println("空学生： ");
        studentTest.talk();
        studentTest.ask();
        studentTest.date();
        System.out.println();

//=========================================================studentME
        // 创建一个新的Student对象
        Student studentME = new Student();

        // 使用setter方法逐步设置属性
        studentME.setName("张三");
        studentME.setAge(20);
        studentME.setGender("男");
        studentME.setMajor("计算机科学");
        studentME.setClassNo("CS101");

        System.out.println("自己设置的一个学生： ");
        System.out.println();
        studentME.talk();


        //给student2一个女朋友
        GirlFriends girl = new GirlFriends();
        studentME.setGirlfriend(girl);
        girl.setName("Alice");
        girl.setAge(18);
        girl.setCharacter("暴躁");
        girl.setSex("girl");

        studentME.ask();

//===========================================================studentR

        System.out.println("随机学生： ");

        Student studentR = new Student();
        studentR.GR_Student();

        studentR.talk();

        //给studentR 一个随机女盆友

        GirlFriends gfR = new GirlFriends();
        gfR.GR_GirlFriend();

        studentR.setGirlfriend(gfR);

        studentR.ask();

        //让它去约会
        studentR.date();
    }
}
