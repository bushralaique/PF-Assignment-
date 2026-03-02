public class lab3 
{
    public static int add(int a,int b)
    {
        return a+b;
    }
    public static double add(double a,double b)
    {
        return a+b;
    }
    public static int sub(int a,int b)
    {
        return a-b;
    }
    public static double sub(double a,double b)
    {
        return a-b;
    }
    public static int mul(int a,int b)
    {
        return a*b;
    }
    public static double mul(double a,double b)
    {
        return a*b;
    }
    public static int div(int a,int b)
    {
        if(b==0)
            {System.out.println("b cannot be equal to zero");
            }
            return a/b;
    }
    public static double div(double a,double b)
    {
        if(b==0)
            {System.out.println("b cannot be equal to zero");}
        return a/b;
    }
    public static int max1(int a, int b)
    {
        if(a>b)
            return a;
        else
            return b;
    }
    public static int max2(int a, int b, int c)
    {
        if(a>b && a>c)
        return a;
        else if(b>a && b>c)
            return b;
        else
            return c;
    }
    public static void main(String[]args)
    {
        int a=16;
        int b=4;
        int c=2;
        System.out.println("Addition");
        int d =add(a,b);
        System.out.println(d);
 System.out.println("Subtraction");
        int e =sub(a,b);
        System.out.println(e);
         System.out.println("Multiplication");
        int f=mul(a,b);
        System.out.println(f);
         System.out.println("Division");
        int g =div(a,b);
        System.out.println(g);
 System.out.println("Max Among Two");
        int h =max1(a,b);
        System.out.println(h);
         System.out.println("MAx Among Three");
        int i =max2(a,b,c);
        System.out.println(i);
        
    }
}







    





