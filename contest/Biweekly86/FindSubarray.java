public class FindSubarray
{
    public static boolean findSubarrays(int[] a) {
        
        for(int i = 1; i<a.length; i++)
        {
            for(int j = i+1; j<a.length; j++)
            {
                if(a[i]+a[i-1] == a[j]+a[j-1])
                {
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String []args)
    {
        int []a = {4,2,4};
        System.out.println(findSubarrays(a));
    }

}