public class RotateArrayKTimes {

    public static int[] rotateArrayKTimes(int[] a, int k)
    {
        int n = a.length,temp = 0;
        k=k%n;
        int j = a.length-1;
        for(int x = 0; x < k; x++)
        {
            for(int i = 0; i<a.length; i++)
            {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        return a;
    }
    public static int[] rotateArrayKTimesAntiClockWise(int[] a, int k)
    {
        int n = a.length,temp = 0;
        k=k%n;
        int j = 0;
        for(int x = 0; x < k; x++)
        {
            for(int i = a.length-1; i>0; i--)
            {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        return a;
    }

    public static void main(String []args)
    {
        int []a = {1,2,3,4,5};
        int x[] = rotateArrayKTimesAntiClockWise(a,2);

        for(int y : x)
        {
            System.out.println(y);
        }

    }
}
