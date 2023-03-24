//WAP to insert or add a character in the end of the string
//Input1 :Preethaa
//Input1 :D
//Output1:PreethaaD
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
		System.out.print("Enter a character to be inserted:");
		char c1=in.next().charAt(0); //taking user input of a character
		char c2;
		for(int i=0;i<length;i++)
		{
		    c2=string1.charAt(i);
		    string2=string2+c2;
		}
		string2=string2+c1;
		System.out.print("After inserting or adding a character in the end of string:"+string2);
	}
}
