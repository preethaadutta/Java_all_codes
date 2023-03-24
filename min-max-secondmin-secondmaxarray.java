//WAP to print maximum or or highest or largest and minimum or smallest and second maximum and second minimum elements from an array

import java.util.*;
public class Main
{
    public static void main(String []args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of elements in array:");
        int n=in.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter elements of array:");
            array[i]=in.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int secondmax=Integer.MIN_VALUE; 
        int secondmin=Integer.MAX_VALUE;
        for(int i=0;i<n;i++) 
        {
            if(array[i]>=max)
            {
                max=array[i];
            }
            if(array[i]<=min)
            {
                min=array[i];
            }
        }
        for(int j=0;j<n;j++)
        {
            if(array[j]>=secondmax && array[j]!=max)
            {
                secondmax=array[j];
            }
            if(array[j]<=secondmin && array[j]!=min)
            {
                secondmin=array[j];
            }
        }
        System.out.println("Maxinum Element="+max);
        System.out.println("Minimum Element="+min);
        System.out.println("Second Minimum Element="+secondmin);
        System.out.println("Second Maxinum Element="+secondmax);
    }
}