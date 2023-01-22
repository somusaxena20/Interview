import java.util.*;

class GroupAssigenment
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
            HashMap<Integer, Integer> m = new HashMap<>();
            for(int i = 0; i<n; i++)
            {
                a[i] = sc.nextInt();

                if(m.containsKey(a[i]))
                {
                    m.put(a[i], m.get(a[i])+1);
                }
                else
                {
                    m.put(a[i], 1);
                }
            }

            int c = 0;
            for(int i = 0; i<n; i++)
            {
                if(m.get(a[i]) % a[i] == 0)
                {
                    c++;
                }
            }

            if(c == n)
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