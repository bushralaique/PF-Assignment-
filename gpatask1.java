import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class gpatask1
{
    public static void main(String[] args) throws IOException
    {
        Path filePath=Path.of("C:\\Users\\DELL\\OneDrive\\PF\\untitled\\out\\student.csv");
        String Filecontent=Files.readString(filePath);
        String[] rows=Filecontent.split("\n");
        String header=rows[0];
        System.out.println(header);
        for(int i=1,j=3;i<rows.length;i++)
        {
            String row=rows[i];
            String[] column=row.split(",");
            String element=column[j];
            double a=Double.parseDouble(element);
            if(a>=3.5)
            {
                System.out.println(row);
            }
        }

    }
}
