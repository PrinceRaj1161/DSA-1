import java.util.*;
public class Sorting 
{
    public static void Bubble(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void Selection(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int minpos=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minpos])
                {
                    minpos=j;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }

    public static void Insertion(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int curr=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>curr)
            {
                arr[j+1]=arr[j];
                j--;
            }

            // Insertion 
            arr[j+1]=curr;
        }
    }

    public static void Print(int arr[])
    {
        System.out.print("The numbers are: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void Count(int arr[])
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of numbers: ");
        int num=sc.nextInt();
        System.out.print("Enter the numbers: ");
        int arr[]=new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        //Bubble(arr);
        //Selection(arr);
        //Insertion(arr);


        //Arrays.sort(arr);  //Inbuilt function O(n*logn);
        //Arrays.sort(arr,0,3);

        Count(arr);
        Print(arr);
    }
}
