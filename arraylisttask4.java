import java.util.ArrayList;

public class arraylisttask4
{
    public static void main(String[] args) {
        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        elements.add(3);
        elements.add(4);
        elements.add(5);
        for (int i = 0, j = 5; i<=4; i++, j--)
        {
            elements.set(i, j);
        }
        System.out.println(elements);
    }
}
