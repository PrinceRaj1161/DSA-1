import java.util.*;
public class BinomialCoff 
{
    public static int factorial(int n)
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
        int n=sc.nextInt();
        int r=sc.nextInt();
        sc.close();
        float ans=((float)factorial(n))/(factorial(r)*factorial(n-r));
        System.out.println("The answer is "+ans);
    }
}
