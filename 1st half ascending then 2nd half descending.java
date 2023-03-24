//WAP to sort 1st half in ascending order and 2nd half in descending order in an array
//Input: [5,2,4,7]   => n=4=> even => j=n/2
//Output:[2,4,7,5] from n/2 index the descending order sort
//Input: [5,2,4,7,9] => n=5=> odd  => j=(n-1)/2
//Output:[2,4,9,7,5] from (n-1)/2 index the descending order sort

import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int n=in.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter elements in array: ");
            array[i]=in.nextInt();
        }
        //sorting 1st part
        //Bubble sort- smallest to largest- ascending order sort
        //sorting whole array smallest to largest 
        int temp1;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(array[j]>array[j+1])
                {
                    //swapping using third variable
                    temp1=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp1;
                }
            }
        }
        //sorting 2nd part
        //Bubble sort- largest to smallest- descending order sort
        //checking number of array elements even or odd
        if(n%2==0) //if number of array elements even
        {
            int temp2;
            for(int i=0;i<n-1;i++)
            {
                for(int j=n/2;j<n-1-i;j++) //for even j=n/2
                {
                    if(array[j]<array[j+1])
                    {
                    //swapping using third variable
                    temp2=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp2;
                    }
                }
            }
        }
        else //if number of array elements odd
        {
            int temp2;
            for(int i=0;i<n-1;i++)
            {
                for(int j=(n-1)/2;j<n-1-i;j++) //for odd j=(n-1)/2
                {
                    if(array[j]<array[j+1])
                    {
                    //swapping using third variable
                    temp2=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp2;
                    }
                }
            }
        }
        System.out.println("After sorting the new array will be: ");
        for(int i=0;i<n;i++)
		{
		    System.out.print(" "+array[i]);
		}
    }
}