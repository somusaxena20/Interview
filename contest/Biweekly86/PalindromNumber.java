public class PalindromNumber {
    public static boolean isStrictlyPalindromic(int n) {
        

        for(int i = 2; i<n-1; i++)
        {
            String s = Integer.toString(n,i);
            if(!palindrome(s))
            {
                return false;
            }
        }
        return true;
    }

    public static boolean palindrome(String s)
    {
        for(int i = 0; i <s.length()/2; i++)
        {
            if(s.charAt(i) != s.charAt(s.length() -1-i))
            {
                return false;
            }
        }
        return true;

    }

    public static void main(String []args)
    {
        System.out.println(isStrictlyPalindromic(4));
    }
}
