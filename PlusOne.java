// public class PlusOne {

//     public static int[] plusOne(int []a)
//     {
        
//         String str = "";

//         for(int x : a)
//         {
//             str +=x;
//         }


//         int val = Integer.valueOf(str);
//         val +=1;
//         str = String.valueOf(val);
//         if(str.length() > a.length)
//         {
//             for(int i = 0; i<str.length(); i++)
//             {
//                 int []arr = new int[a.length+1]; 
//                 arr[i] = Integer.parseInt(str.charAt(i)+"");
//             }
//             return arr;
//         }
//         else
//         {
//             for(int i = 0; i<str.length(); i++)
//             {
//                 a[i] = Integer.parseInt(str.charAt(i)+"");
//             }
//             return a;
//         }
//     }

//     public static void main(String []args)
//     {
//         int []a = {9};
//         int []x = plusOne(a);

//         for(int y : x)
//         {
//             System.out.println(y);
//         }

//     }
// }
