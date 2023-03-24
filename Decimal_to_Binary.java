/*
WAP to convert any number from Decimal to Binary:-
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    int number=sc.nextInt();
	    int n=2; //as Decimal to Binary so n=2 if Decimal to Octal then it'll be 8
	    String string1="";
	    int temp=number;
	    //char c[]=string1.toCharArray();
	    while(temp>0)
	    {
	        int rem=temp%n;
	        string1=rem+string1;
	        temp=temp/n;
	    }
	    System.out.println("Binary of that number is: "+string1);
	}
}
