import java.util.*;

public class SprialMatrix 
{
    public static void PrintSprialMatrix(int arr[][])
    {
        int startrow=0;
        int endrow=arr.length-1;
        int startcol=0;
        int endcol=arr[0].length-1;
        while(startrow<=endrow && startcol<=endcol)
        {
            for(int j=startcol;j<=endcol;j++)
            {
                System.out.print(arr[startrow][j]+" ");
            }
            for(int i=startrow+1;i<=endrow;i++)
            {
                System.out.print(arr[i][endcol]+" ");
            }
            for(int j=endcol-1;j>=startcol;j--)
            {
                if(startcol==endcol)
                break;
                System.out.print(arr[endrow][j]+" ");
            }
            for(int i=endrow-1;i>=startrow+1;i--)
            {
                if(startrow==endcol)
                break;
                System.out.print(arr[i][startcol]+" ");
            }
            startrow++;
            startcol++;
            endcol--;
            endrow--;
            System.out.println();
        }

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Rows and Columns: ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        PrintSprialMatrix(arr);
        sc.close();
    }
}
