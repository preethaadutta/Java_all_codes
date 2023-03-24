//WAP to copy a string in same order as of the original string
//Input1 : Preethaa          Input2 : 2358
//Output1: Preethaa          Output2: 2358
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner in=new Scanner(System.in);
		System.out.print("Enter a string:");
		String string1=in.nextLine();
		int length=string1.length(); //length() function returns the length of the string
		String string2=""; //taking an empty string
		char c;
		for(int i=0;i<length;i++)
		{
		    c=string1.charAt(i); //charAt() function is used to extract the i-th index character from the string 
		    string2=string2+c; //for this step the characters of string1 are stored or copied in same order in string2
		}
		System.out.print("The same order copied string is:"+string2);
	}
}
