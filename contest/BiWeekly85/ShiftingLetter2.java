public class ShiftingLetter2 {
    public static String shiftingLetters(String s, int[][] a) {
        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i<a.length; i++)
        {
            for(int j = a[i][0]; j <= a[i][1]; j++)
            {
                if(a[i][2] == 1)
                {
                    if(sb.charAt(j)+1 > 122)
                    {
                        sb.setCharAt(j, (char)(sb.charAt(j)-25));
                    }
                    else
                    {
                        sb.setCharAt(j, (char)(sb.charAt(j)+1));
                    }
                }
                else
                {
                    if(sb.charAt(j)-1 < 97)
                    {
                        sb.setCharAt(j, (char)(sb.charAt(j)+25));
                    }
                    else
                    {
                        sb.setCharAt(j, (char)(sb.charAt(j)-1));
                    }
                }
            }
        }
        return sb.toString();
    }
    public static void main(String []args)
    {
        String  s = "dztz";
        int [][]a = {{0,0,0},{1,1,1}};
        System.out.println(shiftingLetters(s,a));
    }
}
