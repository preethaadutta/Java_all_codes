/*
WAP to replace vowels with special character in a word:-
WAP to replace 0 with 1 in a number:- (same approach I've to follow)
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a word: ");
	    String string1=sc.nextLine();
	    char c[]=string1.toCharArray();
	    for(int i=0;i<c.length;i++)
	    {
	        if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
	        {
	            c[i]='*';
	        }
	    }
	    for(int i=0;i<c.length;i++)
	    {
	        System.out.print(c[i]);
	    }
	}
}
