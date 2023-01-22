import java.util.ArrayList;

class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long> a = new ArrayList<>();
        
        long s = search(arr,x,true);
        long e = search(arr,x,false);
        
        a.add(s);
        a.add(e);
        return a;
    }
    
    long search(long[] num, long target, boolean b) {
        int ans = 0;
        int s =0,e = num.length-1,mid = 0;
        
        while(s <= e)
        {
            mid = s +(e-s)/2; 
            if(target < num[mid])
            {
                e = mid -1;
            }
            else if(target > num[mid])
            {
                s = mid + 1;
            }
            else
            {
                ans = mid;
                if(b)
                {
                    e = mid - 1;
                }
                else
                {
                    s = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String []args)
    {
        
    }    
}
