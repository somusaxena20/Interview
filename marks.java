public class marks
{
    public static void eligible(int Maths, int Bio, int Eng, int Hindi, int Social)
    {
        double sum = Maths+Bio+Eng+Hindi+Social;

        double per = sum/5;


        if((Maths >= 90 && Bio>=70 && per>80) && (Bio >= 90 && per > 60)){
            System.out.println(per+"\nJEE,Medical");
        }
        else if(Maths >= 90 && Bio>=70 && per>80)
        {
            System.out.println(per+"\nJEE");
        }
        else if(Bio >= 90 && per > 60)
        {
            System.out.println(per+"\nMedical");
        }
        else
        {
            System.out.println("Fail");
        }
    }
    public static void main(String [] args)
    {
        eligible(92,94,97,99,90);
    }
}