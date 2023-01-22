package BinarySearch;

public class Searching
{
    public static int linearSearch(int []a, int element)
    {
        for(int i= 0; i<a.length; i++)
        {
            if(a[i] == element)
            {
                return i;
            }
        }
        return -1;
    }


    public static int binarySearch(int []a, int ele)
    {
        int s = 0, e = a.length-1;


        while(s <= e)
        {
            int mid = s + (e - s)/2;

            if(a[mid] < ele)
            {
                s = mid + 1;
            }
            else if(a[mid] > ele)
            {
                e = mid - 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }   
    public static void main(String []args)
    {
        int input [] = {2, 4, 5, 8, 10, 14, 18, 19, 20, 40};
        int x = 14;
        System.out.println(binarySearch(input, x));
    }
}