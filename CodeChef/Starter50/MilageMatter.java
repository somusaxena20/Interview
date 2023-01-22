import java.util.*;
public class MilageMatter
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            double p = x*(n/a);
            double q = y*(n/b);

            if(p < q)
            {
                System.out.println("PETROL");
            }
            else if(q < p)
            {
                System.out.println("DIESEL");
            }
            else
            {
                System.out.println("ANY");
            }
        }
    }
}