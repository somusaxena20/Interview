import java.util.*;
public class GameOfPilesV1 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
		    int n = sc.nextInt();
            int a[] = new int[n];

            for(int i = 0; i<n; i++)
            {
                a[i] = sc.nextInt();
            }


            int chef = 0, chefina = 0;

            for(int i = 0; i<n; i++)
            {
                if(a[i] % 2 == 0)
                {
                    chefina++;
                }
                else
                {
                    chef++;
                }
            }

            if(chef == chefina)
            {
                if(a[n-1] % 2 == 0)
                {
                    System.out.println("Chefina");
                }
                else
                {
                    System.out.println("Chef");
                }
            }
            else if(chef < chefina)
            {
                System.out.println("Chefina");
            }
            else
            {
                System.out.println("Chef");
            }

        }
		
		
		
	}
}
