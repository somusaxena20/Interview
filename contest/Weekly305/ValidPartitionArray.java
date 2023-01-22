import java.util.*;

public class ValidPartitionArray {
    public static boolean validPartition(int[] a) {
        if(exact2(a) || exact3(a) || incresing3(a))
            return true;
        else
            return false;
    }

    public static boolean incresing3(int []a)
    {
        int i = 0, j = 1;

        while(j < a.length)
        {
            if(Math.abs(a[i] - a[j]) == 1)
            {
                if(i+1<a.length && j+1 < a.length)
                {
                    if(Math.abs(a[i+1] - a[j+1]) == 1 && Math.abs(a[i+2] - a[j+2]) == 1)return true;
                }
            }
            else
            {
                i++;
                j++;
            }
        }
        return false;
    } 

    public static boolean exact3(int []a)
    {
        int i = 0, j = 0;

        while(j <a.length)
        {
            if(a[i] == a[j])
            {
                j++;
            }
            else
            {
                if(j-i == 3)
                {
                    return true;
                }
                else
                {
                    i++;
                    j++;
                }
            }
        }
        return false;
    }
    public static boolean exact2(int []a)
    {
        int i = 0, j = 0;

        while(j <a.length)
        {
            if(a[i] == a[j])
            {
                j++;
            }
            else
            {
                if(j-i == 2)
                {
                    return true;
                }
                else
                {
                    i++;
                    j++;
                }
            }
        }
        return false;
    }
    public static void main(String []args)
    {
        int []a = {1,1,1,2};
        System.out.println(incresing3(a));
    }
}
