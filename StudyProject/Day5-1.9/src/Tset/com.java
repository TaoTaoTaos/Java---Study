package Tset;

import java.util.Scanner;

public class com {
    public static void main(String[] args) {
        //读取用户输入到 save
        int[][] save = new int[3][5];
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.println("请输入第" + (i + 1) + "个班" + "的第" + (j + 1) + "个同学的分数");
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                save[i][j] = n;

            }
        }

        //计算每个班的总分到 classSum_Score[]
        int[] classSum_Score = new int[3];
        int sum = 0;

        for (int i = 0; i < save.length; i++) {
            for (int j = 0; j < save[i].length; j++) {
                sum = sum + save[i][j];
            }
            classSum_Score[i] = sum;
            sum = 0;
        }

        //计算每个班的平均分到 av
        int[] av = new int[3];
        for (int i = 0; i < av.length; i++) {
            av[i] = classSum_Score[i] / 5;
        }

        //打印
        for (int k = 0; k < 3; k++) {
            System.out.print("班级" + (k + 1));
            for (int j = 0; j < 5; j++) {
                System.out.printf("%4d", save[k][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            System.out.print("班级" + (i + 1) + "的总分数是： " + classSum_Score[i] + "  ");
            System.out.println("班级" + (i + 1) + "的平均分是： " + av[i]);
        }

    }
}

