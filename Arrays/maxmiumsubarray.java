import java.util.*;
public class maxmiumsubarray 
{
    public static int Brute(int arr[])
    {
        int max=Integer.MIN_VALUE;;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum=sum+arr[k];
                }
                if(sum>max)
                {
                    max=sum;
                }
            }
        }
        return max;
    }

    public static int Prefix(int arr[])
    {
        int pre[]=new int[arr.length];
        pre[0]=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            pre[i]=pre[i-1]+arr[i];
            if(pre[i]>max)
            max=pre[i];
        }
        for(int i=1;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int tempsum=pre[j]-pre[i-1];
                if(tempsum>max)
                {
                    max=tempsum;
                }
            }
        }
        return max;
    }

    public static int Kanade(int arr[])
    {
        int ms=arr[0];
        int cs=0;
        for(int i=0;i<arr.length;i++)
        {
            if(cs<0)
            {
                cs=0;
            }
            cs=cs+arr[i];
            ms=Math.max(cs, ms);
        }
        return ms;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Tha answer via brute method is: "+Brute(arr));
        System.out.println("Tha answer via prefix method is: "+Prefix(arr));
        System.out.println("Tha answer via Kanade's method is: "+Kanade(arr));
        sc.close();
    }
}