/*WAP to find maximum difference among all elements of array. The array is unsorted.*/
Input1:[35,60,50,70]
Output1:25

import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter number of elements in array: ");
	    int n=sc.nextInt();
	    int array[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        System.out.println("Enter elements of array: ");
	        array[i]=sc.nextInt();
	    }
	    int max=Integer.MIN_VALUE;
	    int result=0;
	    for(int i=0;i<n;i++)
	    {
	        if(i!=n-1)
	        {
	            int sub=array[i]-array[i+1];
	            result=Math.abs(sub);
	            if(max<result)
	            {
	                max=result;
	            }
	        }
	    }
		System.out.println("Maximum difference among all elements of array is: "+max);
	}
}
