package Lottery;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {
        // 1. 生成中奖号码：goal[]
        int[] goal = Cnumber();

        // 2. 让用户选号
        int[] save = Choose();

        System.out.print("您选择的号码是： ");
        for (int k : save) {
            System.out.print(k + " ");
        }
        System.out.println();
        System.out.print("中奖号码是: ");
        for (int i : goal) {
            System.out.print(i + " ");
        }
        System.out.println();

        //3. 判断红球中奖个数
        int countR = 0;
        int[] redBalls = Arrays.copyOf(goal, goal.length - 1);
        // 只包含红球的数组
        for (int i = 0; i < save.length - 1; i++) {
            if (contain(save[i], redBalls)) {
                countR++;
            }
        }
        //判断蓝球中奖情况
        int countB = 0;
        if (save[6] == goal[6]) {
            countB = 1;
        }
        System.out.println("红球中奖个数" + countR);
        System.out.println("蓝球中奖个数" + countB);

        // 判断中了几等奖
        if (countR == 6 && countB == 1) {
            System.out.println("恭喜你中了一等奖！");
        } else if (countR == 6) {
            System.out.println("恭喜你中了二等奖！");
        } else if (countR == 5 && countB == 1) {
            System.out.println("恭喜你中了三等奖！");
        } else if (countR == 5 || (countR == 4 && countB == 1)) {
            System.out.println("恭喜你中了四等奖！");
        } else if (countR == 4 || (countR == 3 && countB == 1)) {
            System.out.println("恭喜你中了五等奖！");
        } else if (countB == 1) {
            System.out.println("恭喜你中了六等奖！");
        } else {
            System.out.println("很遗憾，你没有中奖。");
        }
    }

    public static int[] Cnumber() {
        // 生成中奖号码
        int[] goal = new int[7];
        Random r = new Random();
        for (int i = 0; i < 6; )// 生成 6 个红球
        {
            int num = r.nextInt(33) + 1;
            if (!contain(num, goal)) {
                goal[i] = num;
                i++;
            }
        }

        int num = r.nextInt(16) + 1;// 生成第 7 位蓝球
        goal[6] = num;

        return goal;
    }

    public static int[] Choose() {
        int[] saved = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.println();
            System.out.println("请输入第 " + (i + 1) + " 个红球号码（1-33）");
            int num = sc.nextInt();
            if (num < 1 || num > 33) {
                System.out.println("红球超出范围，请重新输入");
            } else if (!contain(num, saved)) {
                saved[i] = num;
                i++;
            } else {
                System.out.println("红球重复，请重新输入");
            }
        }
        System.out.println("请输入蓝球号码（1-16）");
        int num = sc.nextInt();
        if (num < 1 || num > 16) {
            System.out.println("蓝球超出范围，请重新输入");
        } else {
            saved[6] = num;
        }


        return saved;
    }

    public static boolean contain(int x, int[] arr) {
        for (int j : arr) {
            if (x == j) {
                return true;
            }
        }
        return false;
    }
}



