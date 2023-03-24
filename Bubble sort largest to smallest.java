//Bubble sort largest to smallest elements
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter number of elements in array:");
		int n=in.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    System.out.print("Enter elements of array:");
		    array[i]=in.nextInt();
		}
		//sorting- Bubble sort 
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n-i-1;j++)
		    {
		        if(array[j]<=array[j+1]) //largest to smallest sort
		        {
		            //swapping without using third variable
		            array[j]=array[j]+array[j+1]; 
		            array[j+1]=array[j]-array[j+1];
		            array[j]=array[j]-array[j+1];
		        }
		    }
		}
		System.out.println("After sorting the new array will be:");
		for(int i=0;i<n;i++)
		{
		    System.out.print(" "+array[i]);
		}
	}
}