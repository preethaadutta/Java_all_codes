/*
Welcome to the simple math helper.
What would you like to calculate?
1. Sqrt
2. Log
3. Factorial
1
Enter the number to sqrt:
9
3
*/
import java.util.*;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) 
	{
	    System.out.println("Welcome to the simple math helper.");
	    Scanner in=new Scanner(System.in);
		System.out.println("What would you like to calculate?");
		System.out.println("1. Sqrt");
		System.out.println("2. Log");
		System.out.println("3. Factorial");
		int choice=in.nextInt();
		//System.out.println("Enter value of the first number=");
	    //int a=in.nextInt();
		
		//int result;
        //float result1;
        switch(choice)
        {
    	        case 1:
    		        System.out.println("Enter the number to sqrt:");
	                int a=in.nextInt();
		            int squareroot=0;
                    for(int i=1;i<=a;i++)
                    {
                        if(a%i==0)
                        {
                            if(i*i==a)
                            {
                                squareroot=i;
                            }
                        }
                    }
                    if(squareroot==0)
                    {
                        squareroot=0;
                        System.out.println(squareroot);
                    }
                    else
                    {
                        System.out.println(squareroot);
                    }  
    		        break;
    	        case 2:
    		        System.out.println("Enter the number to find log:");
	                int b=in.nextInt();
		            System.out.println("Enter the base:");
	                int c=in.nextInt();
                    double logarithm;
                    logarithm=Math.log(b)/Math.log(c);
                    System.out.println(logarithm);
		            break;
	            case 3:
	                System.out.println("Enter the number to find factorial:");
	                int d=in.nextInt();
	                int i;
	                int factorial=1;
		            for(i=1;i<=d;i++)
		            {
		                factorial=factorial*i;
		            }
		            System.out.println(factorial);
		            break;
	            default:
		            System.out.println("No choice found");
        }
	}
}