public class lab1
{
    public static int[][]addmatrix(int[][]a,int[][]b)
    {
        int[][]c=new int[a.length][b[0].length];
        for(int i=0; i<a.length ;i++)
        {
          for(int j=0; j<b[0].length;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+"  ");
            } 
            System.out.println(); 
        }
       return (c);
        }
public static void main(String[] args)
{
    int[][]a={{1,2,3},{2,3,4},{2,1,3}};
     int[][]b={{1,7,3},{2,7,4},{0,1,3}};
     int[][]result =addmatrix(a,b);
System.out.println(result);
}
}