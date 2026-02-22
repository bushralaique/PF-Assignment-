import java.util.Scanner;
class main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        float avg=0;
        System.out.println("HOW MANY NO. OF STUDENT'S RESULT U WANT TO ENTER");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        avg=sum/n;
        System.out.println(avg);
    }
}