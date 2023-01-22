// public class FurthestBuildingYouCanReach {
//     public static int furthestBuilding(int[] a, int bricks, int ladders) {
//         if(a.length == 1)return 0;

//         for(int i = 1; i<a.length; i++)
//         {
//             if(bricks <= (a[i]-a[i-1]) && ladders == 0 && a[i-1] < a[i])
//                 return i-1;


//             if(a[i-1] < a[i] && (bricks >= (a[i]-a[i-1]) || ladders != 0))
//             {
//                 if(Math.abs(a[i]-a[i-1]) <= bricks)
//                 {
//                     bricks -= a[i]-a[i-1];
//                 }
//                 else if(ladders != 0)
//                 {
//                     ladders -= 1;
//                 }
//                 else
//                 {
//                     return i-1;
//                 }
//             }
//         }
//         return a.length -1;
//     }

//     static int f(int ind, int []a)
//     {
//         if(ind == a.length)return 0;

        
//     }

    
//     public static void main(String []args)
//     {
//         int []a = {4,12,2,7,3,18,20,3,19};
//         System.out.println(furthestBuilding(a,10,2));
//     }
// }
