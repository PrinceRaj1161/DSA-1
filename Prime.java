import java.util.*;
public class Prime 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        int flag=1;
        for(int i=2;i<Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                flag=0;
                break;
            }
        }
        if(flag==1)
        {
            System.out.print("Yes, it is a prime number. ");
        }
        else 
        {
            System.out.println("It is not a prime number.");
        }
    }
}
