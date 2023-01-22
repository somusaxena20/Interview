import java.util.HashMap;

public class CheckDistance
{
    public static boolean checkDistances(String s, int[] a) {
        char []ch = s.toCharArray();
        HashMap<Integer, Integer> m = new HashMap<>();

        for(int i =0; i<ch.length; i++)
        {
            int y = ch[i] - 97;
            if(m.get(y) != -1)
            {
                int dis = 
            }
        }

    }
    public static void main(String []args)
    {
        String s = "abaccb";
        int []a = {1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println(checkDistances(s,a));
    }
}