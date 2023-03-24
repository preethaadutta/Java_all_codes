//WAP to print the Matrix whose elements are the sum of another two Matrices
//Input1 :Matrix1=[[2,4,5],[2,1,4]]
//        Matrix2=[[5,6,3],[5,2,1]]
//Output1:arraysum=[[7,10,8],[7,3,5]]

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
        int twodarray1[][]=new int[rows][coloumns];
        System.out.println("Enter the elements of rows*coloumns Matrix:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<coloumns;j++)
            {
                twodarray1[i][j]=in.nextInt();
            }
        }
        int twodarray2[][]=new int[rows][coloumns];
        System.out.println("Enter the elements of rows*coloumns Matrix:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<coloumns;j++)
            {
                twodarray2[i][j]=in.nextInt();
            }
        }
        int sum=0;
        int twodarraysum[][]=new int[rows][coloumns];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<coloumns;j++)
            {
                for(int k=0;k<rows;k++)
                {
                    for(int l=0;l<coloumns;l++)
                    {
                        if((i==k)&&(j==l))
                        {
                            sum=0;
                            sum=sum+twodarray1[i][j]+twodarray2[k][l];
                            twodarraysum[i][j]=sum;
                        }
                    }
                }
            }
        }
        //displaying the Matrix
        System.out.println("Sum of the elements of two Matrices are:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<coloumns;j++)
            {
                System.out.print(twodarraysum[i][j]+" ");
            }
            System.out.println(); //for printing in a new line
        }
    }
}