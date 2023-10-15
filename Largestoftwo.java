import java.util.*;
public class Largestoftwo 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        if(a>b)
        {
            System.out.println("First number is greater");
        }
        else if(a<b)
        {
            System.out.println("Second number is greater");
        }
        else 
        {
            System.out.println("Both are equal");
        }
    }
}
