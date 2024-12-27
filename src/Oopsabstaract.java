abstract class Oopsabstaract
{
    abstract void fly();
    public void eat()
    {
        System.out.println("Birds eats food");
    }
}
abstract class Bird extends Oopsabstaract
{
    void fly()
    {
        System.out.println("Bird flys");
    }
}

class Eaggle extends Bird
{
    void fly()
    {
        System.out.println("Eaggle flys");
    }
}

class Launch
{
    public static void main(String args[])
    {
        Eaggle obj=new Eaggle();
        obj.fly();
        obj.eat();
    }
}