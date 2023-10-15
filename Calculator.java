import java.util.*;
public class Calculator 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter the operation: ");
        char op=sc.next().charAt(0);
        sc.close();
        switch (op) 
        {
            case '+':
                System.out.println(a+" + "+b+" = "+(a+b));
                break;
            case '-':
                System.out.println(a+" - "+b+" = "+(a-b));
                break;
            case '*':
                System.out.println(a+" * "+b+" = "+(a*b));
                break;
            case '/':
                System.out.println(a+" / "+b+" = "+(a/b));
                break;
            case '%':
                System.out.println(a+" % "+b+" = "+(a%b));
                break;
            default:
                System.out.println("Not a correct operator. ");
                break;
        }
    }
}
