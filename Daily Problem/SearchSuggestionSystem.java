import java.util.*;
public class SearchSuggestionSystem {
    public static List<List<String>> suggestedProducts(String[] p, String sw) {
        List<List<String>> l = new ArrayList<>();

        for(int i = 0; i<sw.length(); i++)
        {
            List<String> t = new ArrayList<>();
            int c = 3;
            for(String x : p)
            {
                if(c > 0 && x.startsWith(sw.substring(0,i+1)))
                {
                    t.add(x);
                    c--;
                }
            }
            l.add(new ArrayList<>(t));
        }
        return l;
    }
    public static void main(String []args)
    {
        String []s = {"mobile","mouse","moneypot","monitor","mousepad"};
        Arrays.sort(s);
        System.out.println(suggestedProducts(s, "mouse"));
    }
}
