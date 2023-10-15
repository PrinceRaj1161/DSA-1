import java.util.*;
public class FuncQ2 
{
    public static boolean EverOrOdd(int num)
    {
        if(num%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        if(EverOrOdd(num))
        {
            System.out.println("Even");
        }
        else 
        {
            System.out.println("odd");
        }
    }
}
