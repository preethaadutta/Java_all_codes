//WAP to move or shift all the zeros in the left or starting of the array
//Input: [1,6,0,3,8,9,0,2]
//Output:[0,0,1,6,3,8,9,2]

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
		    System.out.print("Enter elements of array: "); //[1,6,0,3,8,9,0,2]
		    array[i]=in.nextInt();
		}
		int count=n-1;
		for(int i=n-1;i>=0;i--) //traversing the array from n-1 to 0 means last to first
		{
		    if(array[i]!=0) //if(array[i]>0) //checking if any element not equal or greater than 0
		    {
		        array[count]=array[i]; //Putting non-zero values in that array from last //[1,6,3,8,9,2]
		        count--; //count=count-1 //it is counting how many non-zero values are there in that array
		    }
		}     //as we are putting non-zero values from last of the array so we're decreasing the count   
		while(count>=0) //checking if count value is less than actual array length 
		{
		    array[count]=0; //this step will put 0 in the empty spaces of array which are in first of array //[0,0,1,6,3,8,9,2]
		    count--; //count=count-1
		}
		System.out.print("After moving all zeros to the left side of the array: ");
		for(int i=0;i<n;i++)
		{
		    System.out.print(array[i]+" ");
		}
    }
}
