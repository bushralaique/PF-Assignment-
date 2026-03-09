public class stringreversal
 {
    public static void main(String[]args)
    {
        String s1="abc";
        String reversed="  ";
        String append="  ";
        int n=s1.length();
        for(int i=0; i<n; i++)
        {
            char c=s1.charAt(i);
            reversed=c+reversed;
        }
        for(int i=n-1; i<=0; i--)
        {
            char c=s1.charAt(i);
            append=append+c;
        }
        System.out.println(reversed);
        System.out.println(append);

    }
}
