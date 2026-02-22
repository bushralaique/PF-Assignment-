import java.util.Scanner;
class main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        boolean found=false;
       System.out.println("ENTER THE TARGET NUMBER");
       int n=sc.nextInt();
       int a[]={14,27,35,48,56};
       int i=0;
       for(i=0; i<5; i++)
       {
           if(a[i]==n)
           {
               found=true;
               break;
           }
       }
       if(found)
       {
           System.out.println(i);
       }
       else
       {
           System.out.println("NOT FOUND");
       }
       
    }
}