public class NonDecresing {
    public static boolean checkPossibility(int[] a) {
        int c = 1;

        for(int i = 0; i<a.length-1; i++)
        {
            if(c != 0 && a[i] > a[i+1] && a[i+1] > a[i+2])
            {
                a[i] = a[i+1]-1;
                c--;
            }
        }

        for(int i = 0; i<a.length-1; i++)
        {
            if(a[i]>a[i+1])
                return false;
        }
        return true;
    }
    public static void main(String []args)
    {
        int []a = {5,7,1,8};
        System.out.println(checkPossibility(a));
    }
}
