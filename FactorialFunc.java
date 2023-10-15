import java.util.*;
public class FactorialFunc 
{
    public static int Factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        int ans=Factorial(num);
        System.out.print("The factorial is: "+ans);
    }
}
