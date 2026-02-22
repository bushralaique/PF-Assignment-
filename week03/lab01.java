import java.util.Scanner;
class main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("HOW MANY VALUES U WANT TO SUM UP");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++)
        {
           a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}