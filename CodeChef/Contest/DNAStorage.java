import java.util.Scanner;

public class DNAStorage
{
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		// Scanner sc = new Scanner(System.in);
		
		// int t = Integer.parseInt(sc.next());
		
		// for(int i1 = 0; i1<t; i1++)
		// {
		    
		    String a = "1001";
		  //  String b = sc.next();
		    StringBuilder str = new StringBuilder();
		    for(int i = 0; i < a.length(); i = i+2)
		    {
                String ch = a.substring(i,i+2);
		        switch(ch)
		        {
		            case "00":
		                str.append("A");
		                break;
		            case "01":
		                str.append("T");
		                break;
		            case "10":
		                str.append("C");
		                break;
		            case "11":
		                str.append("G");
		                break;
		        }
		    }
		    System.out.println(str.toString());
		    
		}
        // sc.close();
		
	// }
}