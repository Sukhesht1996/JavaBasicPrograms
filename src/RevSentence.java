public class RevSentence {
    public static void main(String[] args)
    {
        String str = "I LOVE MY India";
        String word[] = str.split(" ");
        for (int i = word.length - 1; i >= 0; i--) {
            System.out.print(word[i] + " ");
        }
    System.out.println();
        String lWord=word[0];
        String sWord=word[0];
        for(String words:word)
        {
            if (words.length() > lWord.length())
            {
                lWord = words;
            }
            if (words.length()<sWord.length())
            {
                sWord=words;
            }
        }
        System.out.println("Longest Word= "+ lWord);
        System.out.println("Smallest Word= "+ sWord);


    }
}
