public class reverse{

    public static int rev(int n)
    {
        String str = ""+n;
        String s = "";
        for(int i = str.length()-1; i >= 0; i--)
        {
            s+=str.charAt(i);
        }

        int ss = Integer.parseInt(s);
        return ss;
    }

    public static void main(String []args)
    {
        System.out.println(rev(123));
    }
} 