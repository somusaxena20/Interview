import java.util.*;
// https://leetcode.com/problems/longest-consecutive-sequence/
public class LongestConsecutiveSequence {

    // USING SORTING TC : O(nlogn + n)

    // public int longestConsecutive(int[] a) {
    //     if(a.length == 1 || a.length == 0)
    //     {
    //         return a.length;
    //     }

    //     Arrays.sort(a);
    //     int count = 1;

    //     int max = 1;
    //     for(int i = 1; i<a.length; i++)
    //     {
    //         if(a[i] == a[i-1])
    //         {
    //             continue;
    //         }
    //         else if(a[i-1]+1 == a[i])
    //         {
    //             count++;
    //             max = Math.max(max,count);
    //         }
    //         else
    //         {
    //             count = 1;
    //         }
    //     }
    //     return max;
    // }

    // USING SET 
    public static int longestConsecutive(int[] nums) {
        int max = 0;

        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            int count = 1;

            // look left
            int num = nums[i];
            while (set.contains(--num)) {
                count++;
                set.remove(num);
            }

            // look right
            num = nums[i];
            while (set.contains(++num)) {
                count++;
                set.remove(num);
            }

            max = Math.max(max, count);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] a = { 100,4,200,1,3,2  };
        System.out.println(longestConsecutive(a));
    }
}