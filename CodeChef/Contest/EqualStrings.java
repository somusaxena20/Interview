import java.util.*;
public class EqualStrings
{
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		// Scanner sc = new Scanner(System.in);
		
		// int t = Integer.parseInt(sc.next());
		
		// for(int i1 = 0; i1<t; i1++)
		// {
		    
		    String a = "ab";
		    String b = "cd";
		    
		    char []a1 = a.toCharArray();
		    char []b1 = b.toCharArray();
		    
		    int count = 0;
		    for(int i = 1; i < a1.length; i++)
		    {
		        
		        if(a1[i] == a1[i-1] || b1[i] == b1[i-1])
		        {
		            count = 0;
		        }
		        else
		        {
		            count += 1;
		        }
		    }
		    
		    System.out.println(count);
		    
		    
		}
		
	}
