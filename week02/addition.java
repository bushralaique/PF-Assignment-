import java.util.Scanner;

public class addition
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
       int sum=0;
       System.out.println("ENTER NUMBERS TO ADD UP OR ENTER ZERO TO EXIT");
       while(true)
       {
        int a=sc.nextInt();
        if(a==0)
        {break;}
        else
        sum=sum+a;
       }
    
System.out.println(sum);
sc.close();
    }
 
}
