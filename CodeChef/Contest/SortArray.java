import java.util.*;

public class SortArray {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
		    int n = sc.nextInt();
            int []a = new int[n];

            for(int i = 0; i<n; i++)
            {
                a[i] = sc.nextInt();
            }

            int count = 1;

            for(int i = 0; i<n-1; i++)
            {
                for(int j = 0; j<n-i-1; j++)
                {
                    if(a[j] > a[j+1])
                    {
                        int temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;

                        count++;
                    }
                }
            }
            System.out.println(count/2);
		}
    }
}
