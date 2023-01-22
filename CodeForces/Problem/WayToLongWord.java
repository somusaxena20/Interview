import java.util.Scanner;
public class WayToLongWord {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0)
        {
            String s = sc.next();

            if(s.length() > 10)
            {
                StringBuilder sb = new StringBuilder();

                sb.append(s.charAt(0)+ "10" +s.charAt(s.length()-1));
                System.out.println(sb.toString());
            }
            else
                System.out.println(s);
        }
        sc.close();
    }
}
