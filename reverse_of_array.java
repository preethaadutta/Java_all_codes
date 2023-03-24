/* WAP to reverse an array:- */
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner in=new Scanner(System.in);
        //taking user input of Array 
        System.out.print("Enter number of elements in array:");
        int n=in.nextInt();
        int array[]=new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++)
        {
            array[i]=in.nextInt();
        }
        int arrayreverse[]=new int[n];
        for(int i=0;i<n;i++) //for(int i=n-1;i>=0;i--)
        {
            //when i=0 of array then i=n-1 of arrayreverse;
            //when i=1 of array then i=n-2 of arrayreverse;
            //when i=2 of array then i=n-3 of arrayreverse; 
            //so trend is when i of array then n-i-1 of arrayreverse
            arrayreverse[n-i-1]=array[i]; //take one example and by observation get the trend so n-i-1
        }
        //displaying the Array
        System.out.println("Reverse array is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arrayreverse[i]+" ");
        }
	}
}
