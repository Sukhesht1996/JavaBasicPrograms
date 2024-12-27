import com.sun.source.tree.WhileLoopTree;

public class Sumofnumbers
{
    public static void main (String args[])
    {
        //Using For Loop
        int num=0;
        for(int i=1;i<=10;i++)
        {
            num+=i;
        }
        System.out.println("For Loop Sum : "+ num);

        // Using While Loop
        int sum=0,i=1;
        while(i<=10)
        {
            sum+=i;
            i++;
        }
        System.out.println("While Loop Sum : "+ sum);
    }
}
