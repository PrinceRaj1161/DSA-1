import java.util.*;
public class PairsAndSubarraysInArray 
{
    public static void Pairs(int arr[])
    {
        int total_pair=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.print("("+arr[i]+","+arr[j]+")  ");
                total_pair++;
            }
            System.out.println();
        }
        System.out.println("The number of Total Pairs is: "+total_pair);
        return;
    }
    public static void SubArrays(int arr[])
    {
        int total_sub=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                }
                total_sub++;
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("The total subarrays are: "+total_sub);
        return;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the numbers: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The Pairs in the Array are: ");
        Pairs(arr);
        System.out.println("\nThe SubArrays are: ");
        SubArrays(arr);
        sc.close();
    }
}
