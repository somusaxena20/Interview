import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/
public class CheckIfStringContainsAllBinaryOfSizeK{
    public static boolean hasAllCodes(String s, int k) {
        int need = 1 << k;
        Set<String> got = new HashSet<String>();

        for (int i = k; i <= s.length(); i++) {
            String a = s.substring(i - k, i);
            if (!got.contains(a)) {
                got.add(a);
                need--;
                // return true when found all occurrences
                if (need == 0) {
                    return true;
                }
            }
        }
        return false;

    }
    public static void main(String []args)
    {
        String s = "00110110";
        System.out.println(hasAllCodes(s,2));
    }
}
