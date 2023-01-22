public class MinimumRecolor
{
    public static int minimumRecolors(String s, int k) {
        int min = Integer.MAX_VALUE;

        for(int i = 0; i<s.length()-k+1; i++)
        {
            int count = 0;
            for(int j = i; j<s.length() && j-i < k; j++)
            {
                if(s.charAt(j) == 'W')
                {
                    count++;
                }
            }
            min = Math.min(count, min);
        }
        return min;
    }
    public static void main(String []args)
    {
        String s = "WBWBBBW";
        System.out.println(minimumRecolors(s,2));
    }
//     "BWWWBB"
// 6
}