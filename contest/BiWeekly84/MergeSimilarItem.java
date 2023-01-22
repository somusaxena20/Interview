import java.util.*;
public class MergeSimilarItem {
    public static List<List<Integer>> mergeSimilarItems(int[][] a, int[][] b) {
        // Arrays.sort(a,(x,y)->x[0]-y[0]);
        // Arrays.sort(b,(x,y)->x[0]-y[0]);
        
        List<List<Integer>> l = new ArrayList<>();
        for(int i = 0; i<a.length; i++)
        {
            for(int j = 0; j<b.length; j++)
            {
                if(a[i][0] == b[j][0])
                {
                    List<Integer> t = new ArrayList<>();
                    t.add(a[i][0]);
                    t.add(a[i][1]+b[j][1]);
                    l.add(t);
                }
                else
                {
                    if(!l.contains(a[i]))
                    {
                        
                    }
                }
                
            }
        }
        return l;

    }
    public static void main(String []args)
    {
        int a[][] = {{1,1},{4,5},{3,8}};
        int b[][] = {{3,1},{1,5}};
        System.out.println(mergeSimilarItems(a,b));
    }
}
