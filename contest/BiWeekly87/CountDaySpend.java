public class CountDaySpend
{
    public static int countDaysTogether(String aa, String al, String ba, String bl) {

        int []a = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(Integer.valueOf(al.substring(0, 2)) < Integer.valueOf(ba.substring(0,2)))
        {
            return 0;
        }
        else if(Integer.valueOf(al.substring(0, 2)) == Integer.valueOf(ba.substring(0,2)))
        {
            return Integer.valueOf(al.substring(3,5)) - Integer.valueOf(ba.substring(3,5))+1;
        }
        else
        {
            int count = 0;
            int month = Integer.valueOf(ba.substring(0,2));
            int day = Integer.valueOf(ba.substring(3,5));
            int lday = Integer.valueOf(bl.substring(3,5));
            int lmonth = Integer.valueOf(bl.substring(0,2));
            

            while(day <= a[month-1]  && month <= lmonth)
            {
                day++;
                count++;
                if(day == a[month -1])
                {
                    month++;
                }
            }
            return count;
        }
    }

    public static void main(String []args)
    {
        String aa = "09-01", al = "10-19", ba = "06-19", bl = "10-20";
        System.out.println(countDaysTogether(aa,al,ba,bl));
    }
//     "09-01"
// "10-19"
// "06-19"
// "10-20"
}