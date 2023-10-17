import java.util.*;
public class DiagonalSum 
{
    public static void Diagonal(int arr[][])
    {
        int primarySum=0;
        int secondarySum=0;
        for(int i=0;i<arr.length;i++)
        {
            primarySum=primarySum+arr[i][i];
            secondarySum=secondarySum+arr[i][arr.length-1-i];
        }
        System.out.println("The primary sum is: "+primarySum);
        System.out.println("The secondary sum is: "+secondarySum);
        int totalSum=primarySum+secondarySum;
        if(arr.length%2!=0)
        {
            int ind=arr.length/2;
            totalSum=totalSum-arr[ind][ind];
        }
        System.out.println("The total sum is: "+totalSum);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the row for a square matrix: ");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("Enter the matrix: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        Diagonal(arr);
        sc.close();
    }
}
