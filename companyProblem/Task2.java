public class Task2
{
    public static void main(String []args)
    {
        String s = "Hello , Sir";
        

        char []ch = new char[s.length()];

        for(int i = 0; i<ch.length; i++)
        {
            ch[i] = s.charAt(i);
        }
    }
}