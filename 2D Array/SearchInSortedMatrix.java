import java.util.*;
public class SearchInSortedMatrix 
{
    //We are using StarinCase Seach. 
    public static void Search(int arr[][],int key)
    {
        int j=arr[0].length-1;
        int i=0;
        while(i<arr.length && j>=0)
        {
            if(arr[i][j]==key)
            {
                System.out.print("The position of the elemnet is: ("+i+","+j+")");
                return;
            }
            else if(arr[i][j]>key)
            {
                j--;
            }
            else 
            {
                i++;
            }
        }
        System.out.print("No such element found: ");
        return;
    }
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the rows and columns of an array: ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter the matrix: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter the number to Search: ");
        int key=sc.nextInt();
        Search(arr, key);
        sc.close();
    }
}
