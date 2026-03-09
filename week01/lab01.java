import java.util.Scanner;

public class lab01
 {
    public static void main(String[]args)
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUM");
        int a=sc.nextInt();
        System.out.println("TABLE SHOULD BE OF HOW MANY NUM");
        int b=sc.nextInt();
        for(int i=1; i<=b; i++)
        {
           int n=a*i;
            System.out.println(a+"*"+i+"="+n);
        }
        sc.close();
    }
}
