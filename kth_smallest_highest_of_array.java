/* WAP to print k-th smallest and highest element of array:- */
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner in=new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int n=in.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter elements of array: ");
            array[i]=in.nextInt();
        }
        System.out.print("k-th minimum or maximum enter value of k: ");
        int k=in.nextInt();
		int ksmallest,khighest;
        //sorting- Bubble sort 
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n-i-1;j++)
		    {
		        if(array[j]>=array[j+1]) //smallest to largest using Bubble sort
		        {
		            //swapping without using third variable
		            array[j]=array[j]+array[j+1]; 
		            array[j+1]=array[j]-array[j+1];
		            array[j]=array[j]-array[j+1];
		        }
		    }
		}
		for(int i=0;i<n;i++)
		{
			//when k=1,i=0;k=2,i=1;k=3,i=2;......so k-i==1
		    if(k-i==1) //observe the trend after taking any array you'll get the trend
		    {
				ksmallest=array[i];
		        System.out.println(" Smallest element will be: "+ksmallest);
		    }
			//when k=1,i=n-1;k=2,i=n-2;k=3,i=n-3;......so k+i==n
		    if(k+i==n) //observe the trend after taking any array you'll get the trend
		    {
				khighest=array[i];
		        System.out.println(" Highest element will be: "+khighest);
		    }
		}
	}
}
