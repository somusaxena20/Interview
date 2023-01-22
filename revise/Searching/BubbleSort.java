import java.util.*;
public class BubbleSort {
    static void bubbleSort(int []a, int n)
    {
        for(int i = 0; i<a.length-1; i++)
        {
            boolean flag = false;
            for(int j = 0; j<n-i-1; j++)
            {
                if(a[j] > a[j+1])
                {
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                    flag = true;
                }
            }
            if(!flag)
                break;
        }
    }

    static void mergeSort(int []a, int i, int j)
    {
            if(j - i == 1)
                return;

            int mid = (i+j)/2;
            mergeSort(a, i, mid);
            mergeSort(a, mid, j);
            merge(a, i,mid,j);
            
    }
    static void merge(int []a, int i, int mid, int j)
    {
        int s = i, e = mid, k = 0;
        int []b = new int[j-i];
        while(s < mid && e < j)
        {
            if(a[s] < a[e])
            {
                b[k++] = a[s];
                s++;
            }
            else
            {
                b[k++] = a[e];
                e++;
            }
        }

        while(s < mid)
        {
            b[k++] = a[s++];
        }
        while(e < j)
        {
            b[k++] = a[e++];
        }

        for(int t = 0; t<b.length; t++)
        {
            a[i+t] = b[t];
        }
    }
    public static void main(String []args)
    {
        int []a = {20,30,40,50,1,5,54,8,52,4,10};
        int n = a.length;

        bubbleSort(a, n);
        System.out.println(Arrays.toString(a));
    }
}
