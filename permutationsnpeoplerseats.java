//WAP to find all possible permutations in which n people can occupy r seats in a theatre
//Ans: nPr=n!/(n-r)!
import java.util.*;
public class Main
{
    //Below the User defined function block
    //public static datatype it'll return function name(datatype of argument which function is taking)
    public static int getFactorial(int number) 
    {
        int factorial=1;
        for(int i=1;i<=number;i++)
        {
            factorial=factorial*i;
        }
        return factorial;//this function have to return factorial of value
    }
	public static void main(String[] args) 
	{
	    Scanner in=new Scanner(System.in);
	    int npeople;
	    System.out.print("Enter number of people=");
	    npeople=in.nextInt();
	    int rseat;
	    System.out.print("Enter number of seats=");
	    rseat=in.nextInt();
	    int temp=npeople-rseat;
	    //function calling: getFactorial(parameter whose factorial we've to find out)
	    float permutations=getFactorial(npeople)/getFactorial(temp);
		System.out.println("Possible permutations in which n people can occupy r seats in a theatre is="+permutations);
	}
}
