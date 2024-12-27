import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist1
{
    public static void main(String args [])
    {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Watermelon");
        list.set(2,"Cherry");
        list.add("Papya");
        list.add(1,"Grapes" );
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println("For Each Loop O/p: ");
        for(String fruit:list)
        {
           System.out.println(fruit);
        }
        System.out.println("ForLoop O/p: ");
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println("ArrayList is Empty: "+ list.isEmpty());

    }
}
