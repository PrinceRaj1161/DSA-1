import java.util.*;
public class FuncQ4 
{
    public static void Funct(int a,int b)
    {
        System.out.println(Math.pow(a,b));
        System.out.println(Math.sqrt(a));
        System.out.println(Math.abs(a));
        System.out.println(Math.min(a, b));
        System.out.println(Math.max(a, b));

    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        Funct(a, b);
    }
}
