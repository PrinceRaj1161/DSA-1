import java.util.*;
public class SumoffirstNnumbers 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        int sum=0;
        int i=1;
        while(i<=num)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("The sum is "+sum);
    }
}
