public class EvenLengthString
{
    public static void main (String [] args)
    {
        String s="i am a tester";
        String[] words=s.split(" ");
        for(String word: words)
        {
            if (word.length()%2==0)
            {
                System.out.print(word + " ");
            }
        }
    }
}
