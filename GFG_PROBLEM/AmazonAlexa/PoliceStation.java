package AmazonAlexa;

public class PoliceStation
{
    public static int solve(int n, int a, int[] x) {
        
        int lMax = Integer.MIN_VALUE;
        int rMax = Integer.MIN_VALUE;
        int lInd = -1;
        int rInd = -1;

        int i = a-1, j = a;
        while(i >= 0)
        {
            int diff = Math.abs(x[i] - a);

            if(diff > lMax)
            {
                lMax = diff;
                lInd = i;
            }
            i--;
        }

        while(j < x.length)
        {
            int diff = Math.abs(x[j] - a);

            if(diff > rMax)
            {
                rMax = diff;
                rInd = j;
            }
            j++;
        }
        return Math.abs(a-x[lInd]) + Math.abs(a-x[rInd]);
    }
    public static void main(String []args)
    {
        int []a = {4, 5};
        System.out.println(solve(a.length, 1,a));
    }
}