/*
WAP to find any power of any number:-
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    int number=sc.nextInt();
	    System.out.print("Enter a power: ");
	    int power=sc.nextInt();
	    int temp=number;
	    //char c[]=string1.toCharArray();
	    for(int i=0;i<power-1;i++)
	    {
	        temp=temp*number;
	    }
	    System.out.println(number+" to the power "+power+" is: "+temp);
	}
}
