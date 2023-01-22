package assigenments;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeInterval
{
    public int[][] merge(int[][] a) {
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        for(int i = 1; i<a.length; i++)
        {
            ArrayList<Integer> t = new ArrayList<>();
            if(a[i-1][1] >= a[0][i])
            {
                t.add(a[i-1][i-1]);
                t.add(a[i][i]);
                l.add(new ArrayList<>(t));
            }
            else
            {
                
            }
            
    }
    public static void main(String []args)
    {
        int [][]a = {{1,3},{2,6},{8,10},{15,18}};
    }
}