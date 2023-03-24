//WAP to find ASCII Value of any character or any special character or any digit or any symbol
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner in=new Scanner(System.in);
	    char ch;
	    System.out.print("Enter a character=");
	    ch=in.next().charAt(0);
	    int a=(int)ch;
	    System.out.println("ASCII Value of the character is="+a);
	}
}
