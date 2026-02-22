import java.util.Scanner;
class main
{
    public static void main(String[] args)
    {
        int temp=0;
        int i=0;
        int j=5;
        int a[]={1,2,3,4,5,6};
        while(i<j)
        {
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
          i++;
          j--;
        }
        for(int k=0; k<6; k++)
        {
            System.out.println(a[k]);
        }
    }
}