package demo;

public class 数组// 动态初始化：自动计算数组长度
{

    public static void main(String[] args) {

        String[] arr = new String[50];

        arr[0] = "1";
        arr[1] = "2";

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        int[] arr2 = new int[3];
        System.out.println(arr2[0]);

    }
}
