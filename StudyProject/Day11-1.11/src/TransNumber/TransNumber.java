package TransNumber;

import java.util.Scanner;

public class TransNumber {
    public static void main(String[] args) {
/*
用的数组真够多的
 */

        //1.接收整数 num

        Scanner sc = new Scanner(System.in);
        int num;

        while (true) {
            System.out.println("请输入整数");
            num = sc.nextInt();
            if (num > 0 && num < 999999999) {
                break;
            } else {
                System.out.println("请重新输入");
            }

        }
        System.out.print("您的输入是：" + num);
        System.out.println();


        //2.计算 num是几位数 ：count
        int x;
        x = num;
        int count = 0;
        if (x == 0) {
            count = 1;
        } else {
            while (x != 0) {
                x = x / 10;
                count = count + 1;
            }
        }

        System.out.println("您数字的位数：" + count);

        //3.取int num 的每一个数字 存到 save 里（从个位倒着存入）

        int[] save = new int[count];
        for (int i = 0; num != 0; i++) {
            int s = num % 10;

            if (s == 0) {
                break;
            }

            save[i] = s; //存入
            num = num / 10;

        }

        //倒置 save
        int[] Re_save = new int[count];

        int u = 0;
        for (int i = count - 1; i >= 0; i--) {

            Re_save[u++] = save[i];

        }

        System.out.println("拆分为单个数字后：");
        for (int i : Re_save) {
            System.out.print(i + "  ");
        }

        System.out.println();
        //4.把save转化成大写
        String[] Big = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "八", "玖", "十"};
        String[] Final = new String[count];
        for (int k = 0; k < count; k++) {
            Final[k] = Big[Re_save[k]];
        }

        System.out.println("转化成中文大写后：");
        for (int i = 0; i < count; i++) {
            System.out.print(Final[i] + " ");
        }

        //与个十百千万组合打印

        String[] units = {"", "十", "百", "千", "万", "十", "百", "千", "亿"};
        System.out.println("\n与个十百千万亿组合打印后：");
        for (int i = 0; i < count; i++) {
            System.out.print(Final[i] + " " + units[count - 1 - i] + " ");
        }
        System.out.print("元");
    }
}