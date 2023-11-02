import java.util.*;
public class UpperCase 
{
    public static String UpperCas(String str)
    {
        StringBuilder sb=new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<str.length();i++)
        {
            if((i+1)<str.length() && str.charAt(i)==' ')
            {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else 
            {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("The new string is: ");
        str=UpperCas(str);
        System.out.println(str);
        sc.close();
    }
}
