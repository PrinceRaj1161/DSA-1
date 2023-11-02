import java.util.*;
public class Practice 
{
    public static int LowerVowels(String str)
    {
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isLowerCase(str.charAt(i)))
            {
                if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static String sortString(String str)
    {
        char array[]=str.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }

    public static void Anagrams(String str,String str1)
    {
        String str2=sortString(str);
        String str3=sortString(str1);
        if(str2.compareTo(str3)==0)
        {
            System.out.println("The strings "+str+" and "+str1+" are Anagrams.");
            return ;
        }
        System.out.println("The strings "+str+" and "+str1+" are not Anagrams.");
        return;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first String: ");
        String str=sc.next();
        System.out.println("The number of lowercase vowels is: "+LowerVowels(str));
        System.out.print("Enter the second string: ");
        String str1=sc.next();
        Anagrams(str, str1);
        sc.close();
    }
}
