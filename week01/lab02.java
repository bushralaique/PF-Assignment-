import java.util.Scanner;

public class lab02 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;        System.out.println("HOW MANY NUM U WANT TO ENTER");
        int a=sc.nextInt();
        System.out.println("ENTER NUM U WANT TO SUM UP");
         for(int i=0; i<a; i++)
        {
          int b=sc.nextInt();
         sum=sum+b;
        }
        System.out.println(sum);
        sc.close();
    }
}
