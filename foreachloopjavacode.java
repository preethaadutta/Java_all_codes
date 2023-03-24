//WAP to display all the characters of a given string in a newline

import java.io.*;
public class Main
{
	public static void main(String []args) throws IOException
	{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter any string: "); 
	    String input=br.readLine();
        //Method-1
        for(int i=0;i<input.length();i++)
        {
            System.out.println(input.charAt(i));
        }
        //Method-2
        char arr[]=input.toCharArray(); 
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        //Method-3-using for-each loop
        for(char ch:input.toCharArray())
        {
            System.out.println(ch);
        }
	}
}