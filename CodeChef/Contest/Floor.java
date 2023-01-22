import java.util.Scanner;

public class Floor {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		// int t = sc.nextInt();
		
		// while(t-- > 0)
		// {
		    int a = 42;
		    int b = 50;
		    
		    int c = 0;
		    int d = 0;
		    
		    if(a % 10 == 0)
		        c = a/10;
		    else
		        c = (a/10)+1;
		        
		    if(b % 10 == 0)
		        d = b/10;
		    else
		        d = (b/10)+1;
		        
		    System.out.println(Math.abs(c - d));
		  
		}
		
		
		
	// }
}
