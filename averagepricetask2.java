import java.io.IOException;
import java.nio.file.Files;
import java .nio.file.Path;
public class averageprice
{
    public static void main(String[] args) throws IOException
    {
        Path filepath=Path.of("C:\\Users\\DELL\\OneDrive\\PF\\untitled\\out\\product.csv");
        String filecontent= Files.readString(filepath);
        String[] rows=filecontent.split("\n");
        double sum=0.0;
        for(int i=1,j=1;i<rows.length;i++)
        {
            String row = rows[i];
            String[] column = row.split(",");
            String element = column[j];
            double a = Double.parseDouble(element);
            sum=sum+a;
        }
        double average=sum/4.0;
        System.out.println("Average Price:"+average+"PKR");
    }
}
