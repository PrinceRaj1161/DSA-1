import java.util.*;
public class ProductFunc 
{
    public static int Product(int a,int b)
    {
        int pro=a*b;
        return pro;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        int ans=Product(a, b);
        System.out.print("The product is: "+ans);
    }
}
