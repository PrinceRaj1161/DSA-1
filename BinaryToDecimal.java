import java.util.*;
public class BinaryToDecimal 
{
    public static int Convert(int bin)
    {
        int pow=0;
        int ans=0;
        for(int i=bin;i>0;i=i/10)
        {
            int temp=i%10;
            if(temp==1)
            {
                ans=ans+(int)Math.pow(2,pow);
            }
            pow++;
        }
        return ans;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        System.out.println("The decimal of "+num+" is "+Convert(num));
    }
}
