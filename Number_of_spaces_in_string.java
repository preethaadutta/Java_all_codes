/* WAP to print number of spaces in a string:- */
//Input:Enter a string:Java is a famous language
//Output:Number of spaces in string is: 4

import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner in=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string1=in.nextLine();
		int length=string1.length(); //length() function returns the length of the string
		char c;
		int count=0;
		for(int i=0;i<length;i++)
		{
		    c=string1.charAt(i); //charAt() function is used to extract the i-th index character from the string 
		    if(c==' ')
		    {
		        count=count+1;
		    }
		}
		System.out.print("Number of spaces in string is: "+count);
	}
}