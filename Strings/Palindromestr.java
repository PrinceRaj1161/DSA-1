import java.util.*;

public class Palindromestr 
{
    public static Boolean CheckPalindrome(String str)
    {
        int n=str.length();
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)!=str.charAt(n-1-i))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        sc.close();
        if(CheckPalindrome(str))
        {
            System.out.println("The given string is Palindrome");
        }
        else 
        {
            System.err.println("Not a palindrome");
        }
    }
}
