public class Pattern {
    public static void main(String []args)
    {
        int f = 7,s = 6;
        int n = 6;
        int t1=0,t2=0;
        for(int i = 0; i<n;i++)
        {
            for(int j = 0; j<=i; j++)
            {
                if(i % 2 == 0)
                {
                    System.out.print(f + (f * t1)+" ");
                    
                }
                else
                {
                    System.out.print(s + (s * t2)+" ");
                    
                }
            }
            if(i % 2 == 0)
                t1++;
            else
                t2++;
            System.out.println();
        }
    }
}
