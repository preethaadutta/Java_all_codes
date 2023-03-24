/* WAP to print sum of all elements of array:- */
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
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+array[i];
        }
        System.out.print("Sum of all elements of array is: "+sum);
	}
}

