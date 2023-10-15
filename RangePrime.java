import java.util.*;
public class RangePrime 
{
    public static boolean isPrime(int n)
    {
        if(n==2)
        {
            return true;
        }
        else 
        {
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    return false;
                }
            }
            return true;
        }
    }

    public static void PrintPrime(int nu)
    {
        for(int i=2;i<=nu;i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        PrintPrime(num);
    }
}
