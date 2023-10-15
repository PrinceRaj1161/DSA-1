import java.util.*;
public class Reverse 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        int rev=0;
        for(int i=num;i>0;i=i/10)
        {
            rev=rev*10+(i%10);
        }
        System.out.print("The reverse is "+rev);
    }
}
