// https://leetcode.com/problems/maximum-units-on-a-truck/

import java.util.*;
public class MaximumUnitOnTruck {
    public static int maximumUnits(int[][] a, int k) {
        Arrays.sort(a,(x,y)->y[1]-x[1]);
        int sum = 0;
        for(int i = 0; i<a.length; i++)
        {
            if(k == 0)return sum;

            if(a[i][0] <= k)
            {
                sum += (a[i][0] * a[i][1]);
                k = k - a[i][0];
            }
            else
            {
                sum += (k * a[i][1]);
                k = k - k;
            }
            
        }
        return sum;
    }

    public static void main(String []args)
    {
        int [][] a = {{1,3},{2,2},{3,1}};
        System.out.println(maximumUnits(a,4));
    }
}
