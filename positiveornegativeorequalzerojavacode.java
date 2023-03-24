//WAP to check a number is greater or smaller than zero or equal to 0
//WAP to check a number is positive or negative number or equal to 0
import java.util.*;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner in=new Scanner(System.in);
	    int number,temp;
	    System.out.print("Enter a number=");
	    number=in.nextInt();
	    if(number!=0)
	    {
	        temp=Math.abs(number);
	        if(temp==number)
	           {
	               System.out.println("The number is a positive number");
	           }
	        else if(temp!=number)
	           {
	                System.out.println("The number is a negative number");
	           }
	    }
	    else
	    {
	        System.out.println("The number is equal to zero");
	    }
	}
}
