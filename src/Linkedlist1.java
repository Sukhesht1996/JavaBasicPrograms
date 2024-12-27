import java.util.LinkedList;

public class Linkedlist1
{
   public static void main(String args[])
   {
       LinkedList l=new LinkedList();
       l.add("Mango");
       l.add("2");
       l.add("23.789");
       l.remove(1);
       System.out.println(l);
       LinkedList<String> ll=new LinkedList<String>();
       ll.add("Apple");
       ll.add("Grapes");
       l.addAll(ll);
       System.out.println(l);

   }
}
