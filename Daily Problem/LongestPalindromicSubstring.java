public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        
        for(int i = 0; i<s.length(); i++)
        {
            for(int j = s.length()-1; j>i; j--)
            {
                if(isPalindrom(s.substring(i,j+1)))
                {
                    return s.substring(i,j+1);
                }
            }
        }
        return "";
    }
    static boolean isPalindrom(String s)
    {
        if(s.length() == 1)return true;

        for(int i = 0,j= s.length()-1; i<j; i++, j--)
        {
            if(s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }
    public static void main(String []args){
        String s = "babad";
        System.out.println(longestPalindrome(s));

    }
}
