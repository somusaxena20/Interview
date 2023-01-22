import java.util.*;

public class Ramdev
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextInt();
        long b = sc.nextInt();
        long n = sc.nextInt();
        long ans = 0;
        for(int i = 0; i<n; i++)
        {
            long li = sc.nextInt();
            long bi = sc.nextInt();

            ans += Math.max((li/l)*(bi/b), (li/b)*(bi/l));
        }
        System.out.println(ans);
    }
}