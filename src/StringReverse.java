public class StringReverse
{
    public static void main(String[]args)
    {
        String str1="aBCBA";
        String str2=" ";
        for(int i=0;i< str1.length();i++)
        {
            str2=str1.charAt(i)+str2;
        }
        System.out.println(str2);


    }
}
