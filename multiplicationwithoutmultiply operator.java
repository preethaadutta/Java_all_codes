//WAP to multiply two given integers without using multiplication operator
//Logic:- a*b=b times a addition 
  //means 2*3=2+2+2=6
  //means 4*3=4+4+4=12
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner in=new Scanner(System.in);
	    int a,b;
	    int sum=0;
	    System.out.println("Enter 1st number:");
	    a=in.nextInt();
	    System.out.println("Enter 2nd number:");
	    b=in.nextInt();
	    for(int i=0;i<b;i++) //for(int i=1;i<=b;i++) //same
	    {
	        sum=sum+a;
	    }
		System.out.println("Multiplication of the two integers is:"+sum);
	}
}
