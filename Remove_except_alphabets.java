/* WAP to remove all characters from string except alphabets means vowels and consonants:- */
//Input1:Preethaa.dutta@gmail.com
//Output1:Preethaaduttagmailcom

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
		    int a=(int)c;
		    if((a>=65 && a<=90)||(a>=97 && a<=122))
		    //if(((a>=65)&&(a<=90))||((a>=97)&&(a<=122))) //same
		    {
		        string2=string2+c; 
		  //for this step the characters of string1 are stored or copied in same order in string2 except the spaces
		    }
		}
		System.out.print("After removing other characters except alphabets from string: "+string2);
	}
}
