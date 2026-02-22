import java.util.Scanner;
class main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       int a[]={34,71,98,45,23};
       int largest=a[0];
       for(int i=1; i<5; i++)
       {
           if(largest<a[i])
           {
               largest=a[i];
           }
       }
        System.out.println(largest);
    }
}