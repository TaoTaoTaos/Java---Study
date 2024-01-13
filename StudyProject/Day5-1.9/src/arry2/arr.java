package arry2;

import java.util.Arrays;
import java.util.Random;

public class arr {
    public static void main(String[] args) {

        int[][] dd = new int[10][10];
        Random mkrand = new Random();
        int num;
        for (int i = 0; i < dd.length; i++) {
            for (int j = 0; j < dd.length; j++) {
                num = mkrand.nextInt(10);
                dd[i][j] = num;
            }
        }
        //for循环打印
        for (int[] ints : dd) {
            for (int j = 0; j < dd.length; j++) {
                System.out.printf("%3d", ints[j]);
            }
            System.out.println();
        }
        System.out.println("==============================================");
        //toString打印
        System.out.println("deepToString下的打印：");
        System.out.println(Arrays.deepToString(dd));
    }
}
