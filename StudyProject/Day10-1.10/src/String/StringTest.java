package String;

public class StringTest {
    public static void main(String[] args) {

        byte[] bytes = {54, 33, 97, 98};
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }
        String sb = new String(bytes);
        System.out.println(sb);//把字节码转化成数组，相当于用阿斯克码表打印

    }
}
