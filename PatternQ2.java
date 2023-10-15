import java.util.*;
public class PatternQ2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt()-1;
        sc.close();
        for(int i=num;i>=0;i--)
        {
            for(int j=0;j<=num;j++)
            {
                if(j>=i)
                {
                    System.out.print("* ");
                }
                else 
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}