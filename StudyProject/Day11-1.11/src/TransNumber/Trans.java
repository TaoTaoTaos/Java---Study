package TransNumber;

import java.util.Scanner;

public class Trans {
    public static int reverse(int x) {
        long n = 0;
        while (x != 0) {
            n = n * 10 + x % 10;
            x = x / 10;
        }
        return (int) n == n ? (int) n : 0;
    }

    public static void main(String[] args) {
        System.out.println("请输入数字： ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println("您输入的数字： " + x);

        int num = reverse(x);
        System.out.println("反转后的数字： " + num);


    }
}