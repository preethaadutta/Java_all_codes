//WAP to print all possible the continuous or contiguous subarrays of a given integer array
//Input :{1,2,3,4,5}
//Output:1
//       1,2
//       1,2,3
//       1,2,3,4
//       1,2,3,4,5
//       2
//       2,3
//       2,3,4
//       2,3,4,5
//       3
//       3,4
//       3,4,5
//       4
//       4,5
//       5
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
            System.out.print("Enter elements in array: ");
            array[i]=in.nextInt();
        }
		for(int i=0;i<n;i++)
		{
		    for(int j=i;j<n;j++)
		    {
		        for(int k=i;k<=j;k++)
		        {
		            System.out.print(array[k]+" ");
		        }
		        System.out.println();
		    }
		}
	}
}
