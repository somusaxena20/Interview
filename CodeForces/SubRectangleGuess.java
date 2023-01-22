import java.util.Scanner;
public class SubRectangleGuess
{

    static int f(int [][]a)
    {

    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int [][]a = new int[n][m];
            for(int i = 0; i<n; i++)
            {
                for(int j =0; j<m; j++)
                {
                    a[i][j] = sc.nextInt();
                }
            }


            
        }
    }
}