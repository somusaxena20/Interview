import java.util.*;

public class InterLeavingString {
    public static boolean isInterleave(String s1, String s2, String s3) {
        HashMap<Character, Integer> m = new HashMap<>();

        for(int i = 0; i<s1.length(); i++)
        {
            char ch = s1.charAt(i);
            
            if(m.containsKey(ch))
            {
                m.put(ch, m.get(ch)+1);
            }
            else
            {
                m.put(ch, 1);
            }
        }
        for(int i = 0; i<s2.length(); i++)
        {
            char ch = s2.charAt(i);
            
            if(m.containsKey(ch))
            {
                m.put(ch, m.get(ch)+1);
            }
            else
            {
                m.put(ch, 1);
            }
        }


        for(int i = 0; i<s3.length(); i++)
        {
            char ch = s3.charAt(i);

            if(m.containsKey(ch))
            {
                if(m.get(ch) == 1)
                {
                    m.remove(ch);
                }
                else
                {
                    m.put(ch, m.get(ch)-1);
                }
            }
            else
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String []args)
    {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbbaccc";
        System.out.println(isInterleave(s1,s2,s3));
    }
}
