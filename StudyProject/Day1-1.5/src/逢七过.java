public class 逢七过
{
    public static void main(String[] args)
    {

        for (int i = 0; i < 100; i++)
        {
            if ((i / 10 != 7) && ((i/10)%10 != 7) && (i % 7 != 0))
            {
                System.out.println(i);
            }
            else
            {
                System.out.println("过！");
            }
        }

    }
}
