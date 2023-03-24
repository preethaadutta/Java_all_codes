//Process to take multiple string input from user
//array whose each element is a string
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of students: ");
		int n=in.nextInt();
		String array[]=new String[n]; //array is the array of strings means characters
		in.nextLine();
		for(int i=0;i<n;i++)
		{
		    System.out.print("Enter student name, ID, score: "); 
		    array[i]=in.nextLine();
		}
		System.out.println("displaying: ");
		for(int i=0;i<n;i++)
		{
		    System.out.print(array[i]+" ");
		    System.out.println();
		}
    }
}