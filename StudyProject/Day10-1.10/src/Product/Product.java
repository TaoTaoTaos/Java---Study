package Product;
// 定义商品类Product

// 有名称、价格、种类、产地几个属性
// 有一个静态属性，商品类数组
// 有一个四个参数的构造方法
//
// 添加两个静态方法：
//     1.添加商品
//         提示用户输入商品数量
//         然后分别依次输入
//             商品名称
//             价格
//             种类
//             产地
//         将这些商品存入到数组中去
//     2.查询商品
//         在控制台输出如下格式:
//         商品名称    商品价格    商品种类   商品产地
//          XX           XX          XX        XX
//          XX           XX          XX        XX

import java.util.Scanner;

public class Product {
    private String Name;
    private double Price;
    private String Sort;
    private String Origin;

    // ===========================================

    // 构造方法

    public Product(String name, double price, String sort, String origin) {
        Name = name;
        Price = price;
        Sort = sort;
        Origin = origin;
    }

    public Product() {

    }

    // ============================================
    public String getName() {
        return Name;
    }

    public double getPrice() {
        return Price;
    }

    public String getSort() {
        return Sort;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPrice(double price) {
        if (price > 0) {
            Price = price;
        } else {
            System.out.println("请输入正确的价格");
        }
    }

    public void setSort(String sort) {
        Sort = sort;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public void show() {
        System.out.println("========================");
        System.out.println("商品名：   " + this.Name);
        System.out.println("商品价格： " + this.Price);
        System.out.println("商品种类： " + this.Sort);
        System.out.println("商品产地： " + this.Origin);
        System.out.println("========================");
    }

    public void add(int i) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第 " + (i + 1) + " 个产品的名字");
        String s = sc.next();
        this.setName(s);
        this.show();

        System.out.println("请输入第 " + (i + 1) + " 个产品的价格");
        int num = sc.nextInt();
        this.setPrice(num);
        this.show();

        System.out.println("请输入第 " + (i + 1) + " 个产品的种类");
        String k = sc.next();
        this.setSort(k);
        this.show();

        System.out.println("请输入第 " + (i + 1) + " 个产品的产地");
        String u = sc.next();
        this.setOrigin(u);
        this.show();
    }

}
