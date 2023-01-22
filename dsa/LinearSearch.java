package dsa;

import java.util.Arrays;

public class LinearSearch {
    
    public static String search(int [][]a, int t)
    {
        for(int [] x : a)
        {
            for(int y : x)
            {
                if(y == t)
                {
                      return "Found";
                }
            }
        }
        return "Not Found";
    }
    
    public static int evenNum(int []a)
    {
        int count = 0;
           
        // EVEN NUMBER BY CONVERT TO STRING
        
//        for( int x : a)
//        {
//            String s = ""+x;
//            
//            if(s.length() % 2 == 0)
//            {
//                count++;
//            }
//        }


        


        return count;
    }
    
    
//    https://leetcode.com/problems/richest-customer-wealth/submissions/
    
    public static int maximumWealth(int[][] accounts) {
        int temp,max = Integer.MIN_VALUE;
        for(int i = 0; i<accounts.length; i++)
        {
            temp = 0;
            for(int j = 0; j < accounts[i].length; j++)
            {
                temp += accounts[i][j];
            }
            if(temp > max)
            {
                max = temp;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int [][] arr = {{1, 2, 3, 4},{5,6},{7,8,9,10}};
        int target = 18;
        int A[] = {12, 151, 42, 6060, 787977}; 
        System.out.println(maximumWealth(arr));
    }
}
