public class Gap
{
    public static int gap(int[] v) {
		// Write your code here.
        int min = v[0],max=v[0];
        for(int x : v)
        {
            min = Math.min(min,x);
            max = Math.max(max,x);
        }
        
        while(min + 1 <= max - 1)
        {
            min +=1;
            max -=1;
        }
        return max - min;
    }
    public static void main(String []args)
    {
        int []a = {2, 1, 6, 8, 5, 7, 6, 1, 8, 9, 2, 7  };
        System.out.println(gap(a));
    }
}