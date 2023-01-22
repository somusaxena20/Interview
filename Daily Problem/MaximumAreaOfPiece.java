// https://leetcode.com/problems/maximum-area-of-a-piece-of-cake-after-horizontal-and-vertical-cuts/
import java.util.*;

public class MaximumAreaOfPiece {
    public static int maxArea(int h, int w, int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        int hm,vm;

        hm = Math.max(a[0], h-a[a.length-1]);
        vm = Math.max(b[0], w-b[b.length-1]);

        for(int i = 1; i<a.length; i++)
        {
            hm = Math.max(hm, a[i]-a[i-1]);
        }

        for(int i = 1; i<b.length; i++)
        {
            vm = Math.max(vm, b[i]-b[i-1]);
        }

        

        return (int)((long)hm * vm % 1000000007);
    }

    public static void main(String []args)
    {
        int []a = {1,2,4};
        int []b = {1,3};

        System.out.println(maxArea(5,4,a,b));
    }
}
