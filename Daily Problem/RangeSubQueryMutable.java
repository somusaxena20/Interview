// https://leetcode.com/problems/range-sum-query-mutable/

import java.util.*;
public class RangeSubQueryMutable {
    ArrayList<Integer> l;
    public RangeSubQueryMutable(int[] a) {
        this.l = new ArrayList<>();
        for(int i = 0; i<a.length; i++)
        {
            this.l.add(a[i]);
        }
    }
    
    public void update(int index, int val) {
        l.set(index, val);
    }
    
    public int sumRange(int left, int right) {
        int sum = 0;
        for(int i = left; i<= right; i++)
        {
            sum += l.get(i);
        }
        return sum;
    }

    public static void main(String []args)
    {
        int []a = {1,3,5};
        RangeSubQueryMutable r = new RangeSubQueryMutable(a);
        System.out.println(r.sumRange(0,2));
        r.update(1,2);
        System.out.println(r.sumRange(0,2));
    }
}
