import java.util.Scanner;

public class Evenodd
{
    public static void main(String args [])
    {
        //int i=2;
        System.out.println("Enter Number");
        Scanner s=new Scanner(System.in);
        int num =s.nextInt();
        if(num%2==0)
        {
            System.out.println(num + " Num is Even");
        }
        else
        {
            System.out.println(num + " Num is Odd");
        }

    }
}
