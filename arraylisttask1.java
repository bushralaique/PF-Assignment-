import java.util.ArrayList;
public class arraylisttask1
{
    public static void main(String[] args)
    {
        ArrayList <Integer> numbers=new ArrayList<>();
        numbers.add(5);
        numbers.add(-3);
        numbers.add(8);
        numbers.add(-1);
        numbers.add(12);
        numbers.add(-7);
        numbers.add(4);
        for(int i=0; i<numbers.size();i++)
        {
            if(numbers.get(i)>0)
            {
                System.out.println(numbers.get(i));
            }
        }
    }
}
