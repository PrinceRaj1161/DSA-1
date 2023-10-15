import java.util.*;
public class ReverseArray 
{
    public static void Reverse(int arr[])
    {
        int low=0;
        int high=arr.length-1;
        while(low<high)
        {
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        return;
    }

    public static void Print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
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
        Reverse(arr);
        System.out.println("The Reverse of the array is: ");
        Print(arr);
        sc.close();
    }
}
