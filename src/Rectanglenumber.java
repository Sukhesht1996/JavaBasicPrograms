public class Rectanglenumber {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(" " + i);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }

        System.out.println();
        int num = 11;
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 5; j++)
            {
                System.out.print(" "+num);
                num++;
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= 5; i++)
        {
            for(int j=1;j<=5-i+1;j++)
            {
                System.out.print(" ");
            }
            int a=9;
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print(a);
                a--;
            }
            System.out.println();
        }
    }
}
