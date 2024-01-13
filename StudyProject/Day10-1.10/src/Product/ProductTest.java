package Product;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {

        System.out.println("请输入产品个数：");
        Scanner sc = new Scanner(System.in);
        int o = sc.nextInt();
        Product[] save = new Product[o];

        //有 n 个 商品的数组

        for (int i = 0; i < save.length; i++) {

            save[i] = new Product();
            save[i].add(i);
            System.out.println();
            ShowAll(save);

        }


    }

    public static void ShowAll(Product[] save) {
        System.out.println("=======================================================");
        System.out.printf("%-11s%-11s%-13s%-13s\n", "商品名称", "商品价格", "商品种类", "商品产地");
        for (int i = 0; i < save.length; i++) {
            if (save[i] != null) {
                System.out.printf("%-15s%-14.2f%-15s%-15s\n",
                        save[i].getName(),
                        save[i].getPrice(),
                        save[i].getSort(),
                        save[i].getOrigin());
            }
        }
        System.out.println("=======================================================");
    }


}



