/*
    WAP to convert any number from Decimal to Octal:-
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    int number=sc.nextInt();
	    int n=8;
	    String string1="";
	    int temp=number;
	    //char c[]=string1.toCharArray();
	    while(temp>0)
	    {
	        int rem=temp%n;
	        string1=rem+string1;
	        temp=temp/n;
	    }
	    System.out.println("Octal of that number is: "+string1);
	}
}
