/* WAP to remove spaces from a string:- */
//Input:Enter a string: Java is a famous language
//Output:After removing spaces from string: Javaisafamouslanguage

import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner in=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string1=in.nextLine();
		int length=string1.length(); //length() function returns the length of the string
		String string2=""; //taking an empty string
		char c;
		for(int i=0;i<length;i++)
		{
		    c=string1.charAt(i); //charAt() function is used to extract the i-th index character from the string 
		    if(c!=' ')
		    {
		        string2=string2+c; 
		  //for this step the characters of string1 are stored or copied in same order in string2 except the spaces
		    }
		}
		System.out.print("After removing spaces from string: "+string2);
	}
}