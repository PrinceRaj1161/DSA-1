import java.util.*;
public class PatternQ4 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        int pri=1;
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(pri+" ");
                pri++;
            }
            System.out.println();
        }
    }
}
