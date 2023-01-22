import java.util.*;
public class ActivitySelection {
    public static void main(String []args)
    {
        int [][]a = {{1,3}, {2,6},{4,5},{3,4},{5,6}};
        Arrays.sort(a, (b,c)->b[a[0].length-1]-c[a[0].length-1]);
        
        int freeAt = 0;
        int ans = 0;
        for(int i = 0; i<a.length; i++)
        {
            if(freeAt <= a[i][0])
            {
                ans++;
                freeAt = a[i][1];
            }   
        }
        System.out.println(ans);

    }
}
