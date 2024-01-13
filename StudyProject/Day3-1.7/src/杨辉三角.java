import java.util.Scanner;

public class 杨辉三角 {
    public static void main(String[] args) {
        int n;
        System.out.println("请输入行数 :");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        yanghui(n);
    }

    public static void yanghui(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }

        //print
        for (int j = 0; j < n; j++) {
            for (int k = 0; k <= j; k++) {
                System.out.printf("%4d", arr[j][k]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}