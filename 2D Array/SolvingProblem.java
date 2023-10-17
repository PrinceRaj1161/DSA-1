// Question 1 :
// Print the number of 7’s that are inthe 2d array.
// Example :
// Input - int[][] array = { {4,7,8},{8,8,7} };
// Output - 2


// Question 2 :
// Print out the sum of the numbers inthe second row of the “nums” array.
// Example :
// Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
// Output - 18



// Question 3 :
// Write a program to FindTransposeofa Matrix.
// What is Transpose?
// Transpose of a matrix is the process ofswapping therows to columns. 
// For a 2x3 matrix,

// Matrix
//     a11    a12    a13
//     a21    a22    a23

// Transposed Matrix
//     a11    a21
//     a12    a22
//     a13    a23



import java.util.*;
public class SolvingProblem 
{
    public static void Question1(int arr[][])
    {
        int num7=0;
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[0].length; j++) 
            {
                if(arr[i][j]==7)
                {
                    num7++;
                }
            }
        }
        System.out.println("The number of 7 in the array is: "+num7);
    }

    public static void Question2(int arr[][])
    {
        int sum=0;
        for(int i=0;i<arr[0].length;i++)
        {
            sum=sum+arr[1][i];
        }
        System.out.println("The required sum is: "+sum);
    }

    public static int[][] Question3(int arr[][])
    {
        int transpose[][]=new int[arr[0].length][arr.length];
        for(int i=0;i<arr[0].length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                transpose[i][j]=arr[j][i];
            }
        }
        return transpose;
    }

    public static void Print(int array[][])
    {
        for (int i = 0; i < array.length; i++) 
        {
            for (int j = 0; j < array[0].length; j++) 
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the row and columns: ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter the matrix");
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j= 0; j< arr[0].length; j++) 
            {
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();

        Question1(arr);
        Question2(arr);
        int Q3ans[][]=Question3(arr);
        System.out.println("The transpose of the Matrix is: ");
        Print(Q3ans);
    }
}
