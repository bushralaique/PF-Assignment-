import java.util.Scanner;
class main
{
    public static void main(String[] args)
    {
        int a[][]={{0,1,2},{3,4,5},{6,7,8}};
        int b[][]={{2,4,2},{3,6,9},{5,3,2}};
        int c[][]=new int[3][3];
        for(int i=0; i<3; i++)
        {
           for(int j=0; j<3; j++) 
           {
               c[i][j]=a[i][j]+b[i][j];
               System.out.print(c[i][j]+" ");
           }
           System.out.println();
        }
    }
}