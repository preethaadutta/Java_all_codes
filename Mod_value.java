/* WAP to find mod of a given integer */
import java.util.*;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number: ");
	    int n=sc.nextInt();
	    int result=Math.abs(n);
		System.out.println("Mod of that number is: "+result);
	}
}
