public class StringBuild 
{
    public static void main(String args[])
    {
        StringBuilder sb=new StringBuilder();
        for(char i='a';i<='z';i++)
        {
            sb.append(i);
        }
        System.out.println("The string is: "+sb);
        System.out.println("The length is: "+sb.length());
    }
}
