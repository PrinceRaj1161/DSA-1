import java.util.*;
public class LargestString 
{
    public static String Biggest(String str[])
    {
        String ans=str[0];
        for(int i=1;i<str.length;i++)
        {
            if(str[i].compareToIgnoreCase(ans)>0)
            {
                ans=str[i];
            }
        }
        return ans;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of Strings");
        int n=sc.nextInt();
        System.out.println("Enter the Strings: -");
        String str[]=new String[n];
        for(int i=0;i<n;i++)
        {
            str[i]=sc.next();
        }
        System.out.print("The biggest string is: "+Biggest(str));
        sc.close();
    }
}
