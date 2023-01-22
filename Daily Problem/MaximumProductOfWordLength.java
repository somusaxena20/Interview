import java.util.HashSet;

// https://leetcode.com/problems/maximum-product-of-word-lengths/

public class MaximumProductOfWordLength
{
    public static int maxProduct(String[] s) {
        
        for(int i = 0; i<s.length; i++)
        {
            if(distinct(s[i]))
            {
                for(int j = i+1; j<s.length; j++)
                {
                    if(distinct(s[j]))
                    {
                        if(check(s[i],s[j]))
                        {
                            return s[i].length() * s[j].length();
                        }
                    }
                }
            }
        }  
        return 0; 
    }
    public static boolean distinct(String s)
    {
        HashSet<Character> h = new HashSet<>();

        for(int i = 0; i<s.length(); i++)
        {
            if(h.contains(s.charAt(i)))
            {
                return false;
            }
            else
            {
                
                h.add(s.charAt(i));
            }
        }

        return true;
    }

    public static boolean check(String a, String b)
    {
        for(int i = 0; i<a.length(); i++)
        {
            for(int j = 0; j<b.length(); j++)
            {
                if(a.charAt(i) == b.charAt(j))
                    return false;
            }
        }
        return true;
    }
    public static void main(String []args)
    {
        String []words = {"a","ab","abc","d","cd","bcd","abcd"};
        System.out.println(maxProduct(words));
    }
}