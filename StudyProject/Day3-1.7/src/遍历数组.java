public class 遍历数组
{
    public static void main(String[] args) //方法 储存在栈里面
    {
        int [] test =new int[] {1,2,3,4,5}; //变量 储存在栈里面

        System.out.println(test);//打印数组在堆中的地址

        for(int i = 0; i < 5 ; i++)
        {
            System.out.print(test[i]);
        }
        //case1

        System.out.println();

        for (int arr:test)
        {
            System.out.print(arr);
            
        }
        //case2


    }
}
