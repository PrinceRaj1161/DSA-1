import java.util.*;
public class IncomeTax 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int income=sc.nextInt();
        sc.close();
        float tax;
        if(income<500000)
        {
            tax=0f;
        }
        else if(income<1000000)
        {
            tax=(income-500000)*0.2f;
        }
        else 
        {
            tax=500000*0.2f+(income-1000000)*0.3f;
        }
        System.out.println("The tax is "+tax);
    }
}
