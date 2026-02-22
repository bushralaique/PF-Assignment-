import java.util.Scanner;
class main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int b=0;
        int c=0;
       int a[]={1,2,3,4,5,6,7,8};
       for(int i=0; i<8; i++)
       {
           if(a[i]%2==0)
           {
               b=b+1;
           }
           else if(a[i]%2!=0)
           {
               c=c+1;
           }
       }