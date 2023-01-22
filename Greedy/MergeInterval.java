import java.util.*;
public class MergeInterval {

    public static int[][] merge(int[][] a) {
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        Arrays.sort(a,(x,y)->x[1]-y[1]); // sorting array by last element

        int free = 0;
        int last = 0;
        for(int i = 0; i<a.length; i++)
        {
            if(free >= a[i][0])
            {
                l.get(last).set(1, a[i][1]);
                last = i;
            }
            else
            {
                ArrayList<Integer> t = new ArrayList<>();
                t.add(a[i][0]);
                t.add(a[i][1]);
                l.add(t);
            }
            free = a[i][1];
        }
        int [][]r = new int[l.size()][l.get(0).size()];
        for(int i = 0; i < r.length; i++)
        {
            ArrayList<Integer> temp = l.get(i);
            for(int j = 0; j<r[i].length; j++)
            {
                r[i][j] = temp.get(j);
            }
        }
        return r;
    }
    public static void main(String []args)
    {
        int [][]a = {{1,4},{4,5}};
        a = merge(a);

        for(int []x : a)
        {
            System.out.println(Arrays.toString(x));
        }
    }
}
