import java.util.*;
public class NearestCourt {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int z = (x+y)/2;

            if(z-x < z-y)
            {
                System.out.println(Math.abs(z-x));
            }
            else
            {
                System.out.println(Math.abs(z-y));
            }
        }
    }
}
