public class lab2 
{
    public static int[][] printmatrix(int[][]a)
    {
        for(int i=0; i<a.length; i++)
        {
           for(int j=0; j<a[0].length; j++) 
           {
            System.out.print(a[i][j]+" ");
           }
           System.out.println();
        }
        return (a);
    }
    public static void main(String[]args)
    {
        int[][] a ={{1,2,3},{2,3,4},{1,2,0}};
        int[][] result=printmatrix(a);
        System.out.println(result);

    }
}
