import java.util.*;

public class SellAllTheCar {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            int []a = new int[n];

            for(int i = 0; i<a.length; i++)
            {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);
            long mod = (long)Math.pow(10,9)+7;
            int x = 0;
            long ans = 0;
            for(int i = a.length-1; i>=0; i--)
            {
                if(a[i] - x < 0)
                {
                    ans += 0;
                }
                else
                {
                    ans += a[i] - x;
                }
                x++;
            }
            System.out.println(ans%mod);
        }
    }
}
