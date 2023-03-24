//WAP to find log of any number and of any base:-
import java.util.*;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter the number=");
	    int a=in.nextInt();
		System.out.println("Enter the base=");
	    int b=in.nextInt();
        double result1;
        result1=Math.log(a)/Math.log(b);
        System.out.println("Log of that number is="+result1);
	}
}
