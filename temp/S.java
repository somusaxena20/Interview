import java.util.HashSet;

public class S {
    public static void s(int []nums)
    {
    HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            System.out.println(set.add(nums[i]));
            
        } 
        
    }
    public static void main(String []args)
    {
        int []a = {10,20,30,40,10};
        s(a);
    }
}
