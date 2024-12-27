public class LeapYear
{
    public static void main(String[]args)
    {
        int year=2024;
        boolean isLeapYear=false;

        isLeapYear=(year%4==0)||(year%400==0&&year%100!=0)?true:false;
        if(isLeapYear)
        {
            System.out.println(year + " is a Leap Year");
        }
        else
        {
            System.out.println(year + " Not a Leap Year");
        }
    }
}
