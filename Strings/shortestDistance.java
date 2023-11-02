import java.util.*;
public class shortestDistance 
{
    public static Double Distance(String str)
    {
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='E')
            {
                x++;
            }
            else if(str.charAt(i)=='W')
            {
                x--;
            }
            else if(str.charAt(i)=='N')
            {
                y++;
            }
            else 
            {
                y--;
            }
        }
        Double ans=Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
        return ans;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.err.println(Distance(str));
        sc.close();
    }
}
