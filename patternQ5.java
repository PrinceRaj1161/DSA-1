import java.util.*;
public class patternQ5 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        for(int i=0;i<num;i++)
        {
            for (int j=0;j<=i;j++) 
            {
                if((i+j)%2==0)
                {
                    System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
