import java.util.*;
public class Search
{
    public static void Linear(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(key==arr[i])
            {
                System.out.println("The index is: "+i);
                return;
            }
        }
        System.out.println("No such number exist in this array.");
        return;
    }

    public static void Maximum(int arr[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("The maximum number in the arrays is: "+max);
        return;
    }

    public static void Binary(int arr[],int key)
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==key)
            {
                System.out.println("Number is at index: "+mid);
                return;
            }
            else if(arr[mid]<key)
            {
                low=mid+1;
            }
            else 
            {
                high=mid-1;
            }
        }
        System.out.println("No such value exist.");
        return;
    }

    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int num=sc.nextInt();
        int arr[]=new int[num];
        System.out.print("Enter the numbers: ");
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the key: ");
        int key=sc.nextInt();
        Linear(arr, key);
        Maximum(arr);
        Binary(arr, key);
        sc.close();
    }
}