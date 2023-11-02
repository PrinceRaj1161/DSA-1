import java.util.*;
public class Substring 
{
    public static String Substrin(String str,int start,int end)
    {
        String ans="";
        for(int i=start;i<end;i++)
        {
            ans=ans+str.charAt(i);
        }        
        return ans;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.next();
        System.out.print("Enter the start value: ");
        int start=sc.nextInt();
        System.out.print("Enter the end value: ");
        int end=sc.nextInt();
        System.out.println("The substring is: "+Substrin(str, start, end));
        sc.close();
    }
}
