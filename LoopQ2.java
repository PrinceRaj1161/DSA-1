import java.util.*;
public class LoopQ2 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 0 to end. ");
        int esum=0;
        int osum=0;
        while(true)
        {
            int temp=sc.nextInt();
            if(temp==0)
            {
                break;
            }
            if(temp%2==0)
            {
                esum=esum+temp;
            }
            else 
            {
                osum=osum+temp;
            }
        }
        System.out.println("Even sum is: "+esum);
        System.out.println("Odd sum is: "+osum);
        sc.close();
    }
}
