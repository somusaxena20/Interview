import java.util.*;

public class LongestSubstringWithTwoUniqueChar {

    // Brute Force
    public static int LongestSubstring(String s)
    {
        
        int mSize = 0;
        int i = 0, j = 0;
        for(i = 0; i<s.length(); i++)
        {
            boolean flag = false;
            HashMap<Character, Integer> m = new HashMap<>();
            m.put(s.charAt(i),1);
            for(j = 0; j<s.length(); j++)
            {
                if(m.containsKey(s.charAt(j)))
                {
                    m.put(s.charAt(j), m.get(s.charAt(j))+1);
                }
                else
                {
                    m.put(s.charAt(j), 1);
                }

                if(m.size() > 2)
                {
                    mSize = Math.max(mSize, j-i);
                    flag = true;
                    break;
                }
            }

            if(!flag)
            {
                mSize = Math.max(mSize, j-i);
            }
        }
        return mSize;
    }

    // Sliding Window

    public static int longestSubstringSlidingWindow(String s)
    {
        int i = 0, j = 0;
        int mSize = 0;
        HashMap<Character, Integer> m = new HashMap<>();

        while(j < s.length())
        {
            char ch = s.charAt(j);
            
            if(m.containsKey(ch))
            {
                m.put(ch, m.get(ch)+1);
            }
            else
            {
                m.put(ch,1);
            }

            if(m.size() <= 2)
            {
                j++;
            }
            if(m.size() == 2)
            {
                mSize = Math.max(mSize, j-i);
                i++;
                j++;
            }
            else
            {
                while(m.size() > 2)
                {
                    char t = s.charAt(i);
                    if(m.containsKey(t))
                    {
                        if(m.get(ch) == 1)
                        {
                            m.remove(ch);
                        }
                        else
                            m.put(t, m.get(t)-1);
                    }
                    i++;
                }
            }
        }
        return mSize;
    }
    public static void main(String []args)
    {
        String input = "aaabbb";
        System.out.println(longestSubstringSlidingWindow(input));
        input = "aaaaa";
        System.out.println(longestSubstringSlidingWindow(input));
    }
}
