import java.util.*;
public class Question1 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        if(num>0)
        {
            System.out.println("It is a positive number.");
        }
        else if(num==0)
        {
            System.out.println("It is neither a positive nor negative number.");
        }
        else 
        {
            System.out.println("It is negative number.");
        }
        sc.close();
    }
}
