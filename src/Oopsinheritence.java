public class Oopsinheritence
{
   public void eats()
   {
       System.out.println("Animal Eats Food");
   }
   public void run()
   {
       System.out.println("Animal Runs");
   }
}
 class Dog extends Oopsinheritence
{
    public void run()
    {
        System.out.println("Dog Runs Fastly");
    }
}

class Launch1
{
    public static void main(String args[])
    {
        Dog d=new Dog();
        d.run();
        d.eats();
    }
}
