// https://www.codechef.com/problems-old/SAVKONO

import java.util.*;

public class SaveKonoha {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();

        // while(t-- > 0)
        // {
        // int n = sc.nextInt();
        // int z = sc.nextInt();

        int[] a = { 7, 13, 8, 17, 3 };

        int n = a.length;
        int z = 25;
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i<a.length; i++)
        {
            pq.add(a[i]);
        }
        while(z > 0)
        {
            int x = pq.poll();
            z = z-x;
            if(x/2 > 0)
            {
                pq.add(x/2);
            }
            count++;
        }
        System.out.println(count);
        
    }
}
