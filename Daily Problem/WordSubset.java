// import java.util.*;

// public class WordSubset {
//     public static  List<String> wordSubsets(String[] s1, String[] s2) {
//         HashMap<String,Integer> m = new HashMap<>();

//         for(int i = 0; i<s2.length; i++)
//         {
//             if(m.containsKey(s2[i]))
//             {
//                 m.put(s2[i],m.get(s2[i])+1);
//             }
//             else
//             {
//                 m.put(s2[i],1);
//             }
//         }

        
//     }
//     public static void main(String []args)
//     {
//         String s1[] = {"amazon","apple","facebook","google","leetcode"};
//         String s2[] = {"e","o"};
//         System.out.println(wordSubsets(s1,s2));
//     }
// }
