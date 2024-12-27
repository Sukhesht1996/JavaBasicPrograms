public class Fibonnaci
{
    public static void main(String args[])
    {
        int f = 0, s = 1, t;
        System.out.print(f +" ");
        System.out.print(s + " ");
        for (int i = 0; i <= 7; i++) {
            t = f + s;
            System.out.print(t+ " ");
            f = s;
            s = t;
        }
    }
}
