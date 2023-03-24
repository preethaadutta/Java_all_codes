//WAP to reverse a string
//Input1 : Preethaa          Input2 : 2358
//Output1: aahteerP          Output2: 8532
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
		    string2=c+string2; //for this step the chacters of string1 are stored or copied in reverse order in string2
		}
		System.out.print("The reversed string is:"+string2);
	}
}
