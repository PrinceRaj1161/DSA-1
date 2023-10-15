import java.util.*;
public class FuncQ1 
{
    public static float ans()
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        sc.close();
        return (n1+n2+n3)/3.0f;
    }
    public static void main (String args[])
    {
        System.out.println("The average is "+ans());
    }
}
