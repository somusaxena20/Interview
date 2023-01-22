package CodeTonRound2;

import java.util.*;

public class TwoSequence {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();

        // while(t-- > 0)
        // {
            int n = sc.nextInt();
            int m = sc.nextInt();

            String s1 = sc.next();
            String s2 = sc.next();

            // if(fun(s1,s2))
            // {
            //     System.out.println("YES");
            // }
            // else
            // {
            //     System.out.println("NO");
            // }
            StringBuilder sb1 = new StringBuilder(s1);
            fun(0,sb1,s2);
        // }
        sc.close();
    }

    private static void fun(int ind,StringBuilder s1, String s2) {
        
        // if(s1.length() == s2.length())
        // {
        //     return s1.toString().equals(s2);
        // }
        
        char ch1 = s1.charAt(ind);
        char ch2 = s1.charAt(ind+1);  
        s1.deleteCharAt(ind);
        s1.setCharAt(ind, (char)Math.min(ch1,ch2));
        System.out.println(s1.toString());
        // boolean min = fun(ind,s1,s2);
        // boolean max = fun(ind,s1,s2);
    }
}
