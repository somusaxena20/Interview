import java.util.*;

public class DominantElement
{
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
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

            HashMap<Integer, Integer> m = new HashMap<>();

            for(int i = 0; i<a.length; i++)
            {
                if(m.containsKey(a[i]))
                {
                    m.put(a[i], m.get(a[i])+1);
                }
                else
                {
                    m.put(a[i], 1);
                }
            }

            boolean flag = false;
            int max = 0;
            for(Map.Entry<Integer, Integer> e : m.entrySet())
            {
                if(e.getValue() > max)
                {
                    max = e.getValue();
                    flag = true;
                }
                else if(e.getValue() == max)
                {
                    flag = false;
                }
            }

            if(flag)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
		}
		
		
		
	}
}