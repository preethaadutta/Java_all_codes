//WAP to find length of the longest consecutive sequence of a given array of integers
//Input:{1,1,2,3,3,4,5,2,4,5,6,7,8,9,6,-1,-2}
//Output:7
//Reason:1,1,2,3,3,4,5:increasing order:7 elements
//       2,4,5,6,7,8,9:increasing order:7 elements
//so Output:7
import java.util.*;
public class Main
{
    public static void main(String[] args)
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
		int count=1;
		int temp=1;
		int i;
		for(i=0;i<n;i++)
		{
		    count=1;
		    for(int j=i;j<n;j++)
		    {
		        if(j<(n-2)||j==(n-2))
		        {
		             if(array[j]<array[j+1] || array[j]==array[j+1])
		             {
		                  count=count+1;
		             }
		             else
		             {
		                  i=j+1;
		                  break;
		             }
		         }
		    }
		    if(count>temp)
		    {
		        temp=count;
		    }
		}
		System.out.print("Length of the longest consecutive sequence of the array is:"+temp);
    }
}