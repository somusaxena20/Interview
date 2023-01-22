// Given arr  of int find single or consecutive number sum is 0
import java.util.Scanner;
public class Task1
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int []a = {5,1,2,3,0};

        // for(int i = 0; i<n; i++)
        // {
        //     a[i] = sc.nextInt();
        // }
        int sum = 0;
        for(int i = 0; i<n; i++)
        {
            sum = a[i];
            for(int j = i+1; j<n; j++)
            {
                sum += a[j];
            }
            if(sum == 0)
            {
                System.out.println(1);
                break;
            }
        }
        if(sum != 0)
        {
            System.out.println(0);
        }
    }
}