public class lab5 
{
    public static int[][] addmatrix(int[][]a, int[][]b)
    {
    int [][]c=new int [a.length][b[0].length];
    for(int i=0; i<a.length; i++)
    {
        for(int j=0; j<b[0].length; j++)
        {
            c[i][j]=a[i][j]+b[i][j];
            System.out.print(c[i][j] +" ");
        }
        System.out.println();

        }
        return c;
    }
    public static int[][] submatrix(int[][]a, int[][]b)
    {
    int [][]c=new int [a.length][b[0].length];
    for(int i=0; i<a.length; i++)
    {
        for(int j=0; j<b[0].length; j++)
        {
            c[i][j]=a[i][j]-b[i][j];
            System.out.print(c[i][j] +" ");
        }
        System.out.println();

        }
        return c;
    }
    public static int[][] transposematrix(int[][]a)
    {
    int [][]b=new int [a[0].length][a.length];
    for(int i=0; i<a.length; i++)
    {
        for(int j=0; j<a[0].length; j++)
        {
            b[j][i]=a[i][j];
            System.out.print(b[j][i] +" ");
        }
        System.out.println();

        }
        return b;
    }
    public static String symmetriccheck(int[][]a)
    {
    int b=0;
    String s1="Symmetric";
    String s2="Non Symmetric";
    for(int i=0; i<a.length; i++)
    {
        for(int j=0; j<a[0].length; j++)
        {
           if (a[i][j]!=a[j][i]) 
            {
            b++;
           } 
      }
        }
    if(b==0)
    {
        return s1;
    }
    else 
    {
        return s2;
    }
    }
    public static int diaognalsum(int[][]a)
    {
    
    int b=0;
int sum=0;
for(int i=0,j=0; i<a.length ;i++,j++)
{
b=a[i][j];
sum=sum+b;
}
return sum;
}
  public static void main(String[]args)  
  {
    int[][]a={{1,2,3},{2,3,4},{3,4,5}};
    int[][]b={{1,6,3},{2,3,8},{3,0,5}};
System.out.println("result1"); 
int[][]result1=addmatrix(a,b);   
    System.out.println(result1);
    System.out.println("result2");
    int[][]result2=submatrix(a,b);
    System.out.println(result2);
    System.out.println("result3");
    int[][]result3=transposematrix(a);
    System.out.println(result3);
    System.out.println("result4");
    String result4=symmetriccheck(a);
    System.out.println(result4);
    System.out.println("result5");
    int result5=diaognalsum(a);
    System.out.println(result5);
  }
    
}
