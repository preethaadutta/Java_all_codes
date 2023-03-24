//WAP to reverse a string and print the sum of original and reversed string
//Input1 : 123          Input2 : 2358
//Output1: 321          Output2: 8532
//Output1: 444          Output2:10890
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner in=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string1=in.nextLine();
		int length=string1.length(); //length() function returns the length of the string
		String string2="";
		char c;
		for(int i=0;i<length;i++)
		{
		    c=string1.charAt(i);
		    string2=c+string2;
		}
		System.out.print("Reversed string is:"+string2);
		int firstnumber=Integer.parseInt(string1); //typecasting:converting string type variable to integer type
		int secondnumber=Integer.parseInt(string2);//typecasting:converting string type variable to integer type
		int sum=firstnumber+secondnumber;
		System.out.println(); //to print in the next line
		System.out.print("Sum of original string and reversed string is:"+sum);
	}
}
