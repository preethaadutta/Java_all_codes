//WAP to implement java string methods
import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String s1;
		System.out.print("Enter a string:");
		s1=in.nextLine();
		int l=s1.length();
		System.out.println("The length of the string is:"+l);
		String s3=s1.toUpperCase();
		System.out.println("Converting to the uppercase of the string is:"+s3);
		s1=s1.trim();
		int l1=s1.length();
		System.out.println("The length of the string is:"+l1);
	}
}
