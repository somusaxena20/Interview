import java.util.ArrayList;
import java.util.List;

public class BuildStackArrayOperation {
    public static List<String> buildArray(int[] a, int n) {
        List<String> l = new ArrayList<>();
        int i = 0, j = 1;
        while(i<a.length && j <= n)
        {
            if(a[i] == j)
            {
                l.add("Push");
                i++;
            }
            else
            {
                l.add("Push");
                l.add("Pop");
            }
            j++;
        }
        return l;
    }
    public static void main(String []args)
    {
        int []a = {1,2,3};
        System.out.println(buildArray(a,3));
    }
}
