public class Overloading
{
    void method(int a,int b)
    {
        System.out.println("2 Parameters");
    }
    void method(double a)
    {
        System.out.println("1 Param");
    }
    void method(short b, int a)
    {
        System.out.println("3 Parameters");
    }

    public  static void main(String[] args)
    {
        Overloading pat= new Overloading();
        pat.method(3.2);
        pat.method(22,89);
        pat.method((short) 32,66);
    }
}
