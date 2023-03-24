/* 
WAP to check two strings are anagram or not:- 
Anagram is those two words among which one word can be formed rearranging the another word and 
the number of letters of those two words should be same.
Ex:- 'tea' and 'eat'
     'secure' and 'rescue'
*/
//Input:Enter 1st word: tea
//      Enter 2nd word: eat
//Output:Yes anagram

import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st word: ");
		String string1=sc.nextLine();
		int length1=string1.length(); //length() function returns the length of the string
		System.out.print("Enter 2nd word: ");
		String string2=sc.nextLine();
		int length2=string2.length(); //length() function returns the length of the string
		if(length1==length2)
		{
		    char c1,c2;
		    int count=0;
		    for(int i=0;i<length1;i++)
		    {
		        //charAt() function is used to extract the i-th index character from the string 
		        c1=string1.charAt(i);
		        for(int j=0;j<length2;j++)
		        {
		            c2=string2.charAt(j);
		            if(c1==c2)
		            {
		                count=count+1;
		            }
		        }
		    }
		    if(count==length1)
		    {
		        System.out.print("Yes anagram");
		    }
		    else
		    {
		        System.out.print("Not anagram");
		    }
		}
		else
		{
		    System.out.print("Not anagram");
		}
	}
}