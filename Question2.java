import java.util.*;
public class Question2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double temp=sc.nextDouble();
        sc.close();
        if(temp>100)
        {
            System.out.println("Fever");
        }
        else 
        {
            System.out.println("No Fever");
        }
    }
}
