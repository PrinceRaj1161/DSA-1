import java.util.*;
public class LoopQ3 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int fact=1;
        sc.close();
        for(int i=2;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial is: "+fact);
    }
}
