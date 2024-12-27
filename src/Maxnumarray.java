public class Maxnumarray
{
    public static void main(String args[])
    {
        int a[]={20,40,5,10,25,40,40,40,5,5,5,5};
        int max =a[0];
        int min=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            if (a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("Max Num in Array: "+ max);
        System.out.println("Min Num in Array: "+ min);
    }
}
