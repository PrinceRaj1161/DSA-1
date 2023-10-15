import java.util.*;
public class LargestofThree 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();
        if(a>=b && a>=c)
        {
            System.out.println("First number is greater.");
        }
        else if(b>=c)
        {
            System.out.println("Second number is greater. ");
        }
        else 
        {
            System.out.println("Third number is greater. ");
        }
    }
}
