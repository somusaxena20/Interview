
package dsa;


class BinarySearch {
//    public int binarySearch(int a[], int s, int e, int target)
//    {
//        if(s <= e)
//        {
//            int mid = (s+e)/2;
//            if(a[mid] == target)
//            {
//                return mid;
//            }
//            if(a[mid] > target)
//            {
//                binarySearch(a,s,mid-1,target);
//            }
//            else
//            {
//                binarySearch(a,mid+1,e,target);
//            }
//        }    
//        return -1;
//        
//    }
    
    public int binarySearch(int []arr ,int target,int start, int end)
    {
        int s = start, e = end-1,mid=0;
        
        while(s <= e)
        {
            mid = s+(e-s)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid] < target)
            {
                s = mid+1;
            }
            else
            {
                e = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        System.out.println(new binarySearch().binarySearch(arr,20,0,4));
    }
}
