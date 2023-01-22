import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckGeomatricProgression
{
    public static boolean checkGP(int i, int j, int k, int r)
    {
        int f = i*(int)Math.pow(r,0);
        int s = i*(int)Math.pow(r,1);
        int t = i*(int)Math.pow(r,2);
        if(f == i && j == s && k == t)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static List<List<Integer>> tripletIndex(int []a , int r)
    {
        List<List<Integer>> l = new ArrayList<>();
        int i = 0;
        for(i = 0; i<a.length; i++)
        {
            int j = i+1, k = a.length-1;
            while(j <= k)
            {
                if(checkGP(a[i],a[j],a[k],r))
                {
                    if(a[k] == a[k-1])
                        l.add(Arrays.asList(i,j,k--));
                    else if(a[j] == a[j+1])
                        l.add(Arrays.asList(i,j++,k));
                    else
                        l.add(Arrays.asList(i,j++,k--));
                }
                else if(a[i]*Math.pow(r,1) != a[j])
                {
                    j++;
                }
                else
                {
                    k--;
                }
            }
        }
        return l;
    }


    public static void main(String []args)
    {
        int []a = {1,3,9,9,27,81};
        System.out.println(tripletIndex(a,3));
    }
}