import java.util.Scanner;

public class lab4
 {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
       boolean c= primecheck(a);
        System.out.println(c);
        sc.close();
    }   
    public static boolean primecheck(int a)
    { 
         for(int i=2; i<=Math.sqrt(a); i++)
       { 
        if(a%i==0)
         {return false;}
       }
       return true;  
      }
}
