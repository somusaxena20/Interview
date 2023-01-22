package dsa;

import java.util.Scanner;
import java.util.ArrayList;
class Array {
    public void array(int s)
    {   
        Scanner sc = new Scanner(System.in);
        
//        int [][] arr = {{1,2,3,4},{5,6},{7,8,9,10}};
//        
        
        ArrayList <ArrayList <Integer>> arr = new ArrayList<>();
        
        for(int i = 0; i<3; i++)
        {
            arr.add(new ArrayList<>());
        }
        
        for(int i = 0; i<3; i++)
        {
            for (int j = 0; j < 3; j++) {
                arr.get(i).add(sc.nextInt());
            }
        }
        System.out.println(arr);
    }
}
