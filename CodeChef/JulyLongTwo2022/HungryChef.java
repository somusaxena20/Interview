package JulyLongTwo2022;

import java.util.*;
import java.io.*;

public class HungryChef {
    static int []a = {Integer.MIN_VALUE,Integer.MIN_VALUE};

    public static int fun(int x, int y, int n, int r)
    {
        if(x > r && y > n)
        {
            return -1;
        }
        if(r == 0)return 1;
        
        int left = Integer.MIN_VALUE;
        int right = Integer.MIN_VALUE;
        if(x <= r)
        {
            left = 1 + fun(x,y,n-1,r-x);
        }
        if(y <= r)
        {
            right = 1 + fun(x,y,n-1,r-y);
        }
        
        a[0] = Math.max(left, a[0]);
        a[1] = Math.max(right, a[1]);
        return ;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int n = sc.nextInt();
		    int r = sc.nextInt();
		    System.out.println(fun(x,y,n,r));
		}
	}
}
