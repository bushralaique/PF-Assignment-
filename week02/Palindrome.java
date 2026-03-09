public class Palindrome
{
 public static void main(String[]args)
 {
    String s1="CIVIC";
    boolean palindrome =true;
    for(int i=0,j=s1.length()-1; i<j; i++,j--)
    {
        char c=s1.charAt(i);
        char d=s1.charAt(j);
        if(c!=d)
        {
           palindrome=false;
            break;
        }
     }
    if(palindrome)
    {System.out.println("CIVIC IS A PALINDROME");}
    else
    {System.out.println("CIVIC IS'NT A PALINDROME");}
   }
}