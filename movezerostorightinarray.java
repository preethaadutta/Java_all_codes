//WAP to move or shift all the zeros in the right or end of the array
//Input: [1,6,0,3,8,9,0,2]
//Output:[1,6,3,8,9,2,0,0]

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
		int count=0;
		for(int i=0;i<n;i++) //traversing the array from 0 to n means first to last
		{
		    if(array[i]!=0) //if(array[i]>0) //checking if any element not equal or greater than 0
		    {
		        array[count]=array[i]; //Putting non-zero values in that array //[1,6,3,8,9,2]
		        count++; //count=count+1 //it is counting how many non-zero values are there in that array
		    }
		}        
		while(count<n) //checking if count value is less than actual array length 
		{
		    array[count]=0; //this step will put 0 in the last empty spaces of array //[1,6,3,8,9,2,0,0]
		    count++; //count=count+1
		}
		System.out.print("After moving all zeros to the right side of the array: ");
		for(int i=0;i<n;i++)
		{
		    System.out.print(array[i]+" ");
		}
    }
}