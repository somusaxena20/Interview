public class RearramgeBinaryString {
    public static int secondsToRemoveOccurrences(String s) {
        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        while(true)
        {
            count++;
            boolean flag = false;
            for(int i = 1; i<s.length(); i++)
            {
                if(sb.substring(i-1,i+1).equals("01"))
                {
                    sb.replace(i-1,i+1,"10");
                    i++;
                    flag = true;
                }
            }
            if(flag == false)break;
        }
        return count-1;
    }
    public static void main(String []args)
    {
        String s = "11100";
        System.out.println(secondsToRemoveOccurrences(s));
    }
}
