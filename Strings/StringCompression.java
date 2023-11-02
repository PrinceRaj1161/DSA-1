import java.util.*;
public class StringCompression 
{
    public static String Compression(String str)
    {
        StringBuilder sb=new StringBuilder("");
        int count=1;
        char store=str.charAt(0);
        for(int i=1;i<str.length();i++)
        {
            if(store==str.charAt(i))
            {
                count++;
            }
            else 
            {
                if(count==1)
                {
                    sb.append(store);
                    store=str.charAt(i);
                }
                else 
                {
                    sb.append(store);
                    sb.append(count);
                    store=str.charAt(i);
                    count=1;
                }
            }
        }
        if(count==1)
        {
            sb.append(store);
        }
        else 
        {
            sb.append(store);
            sb.append(count);
        }
        return sb.toString();
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        str=Compression(str);
        System.out.println("The new string is: "+str);
        sc.close();
    }
}
