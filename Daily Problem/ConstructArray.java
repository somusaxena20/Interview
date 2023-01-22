import java.util.*;

// https://leetcode.com/problems/construct-target-array-with-multiple-sums/
public class ConstructArray {
    public static  boolean isPossible(int[] target) {
        long s = 0;
    PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
    for (int n : target) {
        s += n;
        q.add(n);
    }        
    while (s > 1 && q.peek() > s / 2) {
        int cur = q.poll();
        s -= cur;
        if (s <= 1) 
            return s == 0 ? false : true;
        q.add(cur % (int)s);
        s += cur % s;
    }
    return s == target.length;
    }
    public static void main(String []args)
    {
        int []a = {9,3,5};
        System.out.println(isPossible(a));
    }
}
