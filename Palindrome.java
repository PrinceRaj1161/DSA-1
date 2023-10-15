import java.util.*;
public class Palindrome 
{
    public static int Palin(int num)
    {
        int ans=0;
        for(int i=num;i>0;i=i/10)
        {
            int temp=i%10;
            ans=ans*10+temp;
        }
        return ans;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        sc.close();
        if(num==Palin(num))
        {
            System.out.println("True");
        }
        else 
        {
            System.out.println("False");
        }
    }
}
