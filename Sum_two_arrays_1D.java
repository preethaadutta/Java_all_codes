//WAP to print the array whose elements are the sum of another two arrays
//Input1 :array1=[2,4,5]
//        array2=[5,6,3]
//Output1:arraysum=[7,10,8]

import java.util.*;
public class Main
{
    public static void main(String []args)
    {
        Scanner in=new Scanner(System.in);
        //taking user input of Array 
        System.out.print("Enter number of elements in array:");
        int n=in.nextInt();
        int array1[]=new int[n];
        System.out.println("Enter the elements of 1st array:");
        for(int i=0;i<n;i++)
        {
            array1[i]=in.nextInt();
        }
        int array2[]=new int[n];
        System.out.println("Enter the elements of 2nd array:");
        for(int i=0;i<n;i++)
        {
            array2[i]=in.nextInt();
        }
        int arraysum[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arraysum[i]=array1[i]+array2[i]; 
        }
        /* //another process
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    sum=0;
                    sum=sum+array1[i]+array2[j];
                    arraysum[i]=sum;
                }
            }
        }
        */
        //displaying the Array
        System.out.println("Sum of the elements of two arrays are:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arraysum[i]+" ");
        }
    }
}