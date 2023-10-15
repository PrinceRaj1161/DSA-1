import java.util.*;
public class DecimalToBinary
{
    public static String ans(int n)
    {
        String ans="";
        for(int i=n;i>0;i=i/2)
        {
            if(i%2==1)
            {
                ans="1"+ans;
            }
            else 
            {
                ans="0"+ans;
            }
        }
        return ans;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        System.out.println("The binary of "+num+" is "+ans(num));
    }
}
