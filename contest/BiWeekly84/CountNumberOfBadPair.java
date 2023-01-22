public class CountNumberOfBadPair
{
    public static long countBadPairs(int[] a) {
        long count = 0;

        for(int i = 0; i<a.length-1; i++)
        {
            for(int j = i+1; j<a.length; j++)
            {
                if(j - i != a[j] - a[i])
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String []args)
    {
        int []a = {1,2,3,4,5};
        System.out.println(countBadPairs(a));
    }
}