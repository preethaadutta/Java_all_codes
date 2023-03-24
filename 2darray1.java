//2D Array basic code in Java

import java.util.*;
public class Main
{
    public static void main(String []args)
    {
        Scanner in=new Scanner(System.in);
        //taking user input of 2D Array or Matrix
        System.out.print("Enter number of rows in array:");
        int rows=in.nextInt();
        System.out.print("Enter number of coloumns in array:");
        int coloumns=in.nextInt();
        int twodarray[][]=new int[rows][coloumns];
        System.out.println("Enter the elements of rows*coloumns Matrix:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<coloumns;j++)
            {
                twodarray[i][j]=in.nextInt();
            }
        }
        //displaying the Matrix
        System.out.println("The elements of rows*coloumns Matrix are:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<coloumns;j++)
            {
                System.out.print(twodarray[i][j]+" ");
            }
            System.out.println(); //for printing in a new line
        }
    }
}