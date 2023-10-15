import java.util.*;
public class FuncQ5 
{
    public static int Digitsum(int num)
    {
        int sum=0;
        for(int i=num;i>0;i=i/10)
        {
            sum=sum+(i%10);
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        System.out.println("The sum of digits of "+num+" is "+Digitsum(num));
    }
}
