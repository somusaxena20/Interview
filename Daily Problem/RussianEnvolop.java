import java.util.Arrays;

// https://leetcode.com/problems/russian-doll-envelopes/

public class RussianEnvolop
{
    public static int maxEnvelopes(int[][] a) {
        Arrays.sort(a,(b,c)->Integer.compare(b[0],c[0]));
        System.out.println(Arrays.toString(a[0]));
        return 1;
    }
    public static void main(String []args)
    {
        int [][]a = {{5,4},{6,4},{6,7},{2,3}};
        System.out.println(maxEnvelopes(a));
    }
}