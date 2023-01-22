import java.util.Scanner;

public class ZeroOneEqual {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		// Scanner sc = new Scanner(System.in);
		
		// int t = sc.nextInt();
		
		// while(t-- > 0)
		// {
		    int n = 4;
             
            n = (int)Math.pow(4,2)-1;
            for(int i = 1; i<= n; i++)
            {
                String s = Integer.toBinaryString(i);
                System.out.println(String.format("%4s",s).replaceAll(" ","0"));
            }
		// }
		
		
		
	}
}
