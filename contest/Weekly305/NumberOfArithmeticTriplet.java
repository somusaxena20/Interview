public class NumberOfArithmeticTriplet
{
    public static int arithmeticTriplets(int[] a, int diff) {
        int count = 0;

        for(int i = 0; i<a.length-2; i++)
        {
            for(int j = i+1; j<a.length; j++)
            {
                for(int k = j+1; k<a.length; k++)
                {
                    if(a[j]-a[i] == diff && a[k]-a[j] == diff)
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String []args)
    {
        int []a = {4,5,6,7,8,9};
        System.out.println(arithmeticTriplets(a,2));
    }
}