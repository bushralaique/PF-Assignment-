import java.util.*;
public class wordcountertask1
{
    public static void main(String[] args)
    {
        String[] sentence={"the", "cat", "and", "the", "dog", "and", "the", "bird"};
        HashMap<String,Integer> words=new HashMap<>();
        for(String word:sentence)
        {
            if (words.containsKey(word))
            {
                int count = words.get(word);
                words.put(word, count + 1);
            }
            else
            {
                words.put(word, 1);
            }
        }
            System.out.println(words);
    }
}
