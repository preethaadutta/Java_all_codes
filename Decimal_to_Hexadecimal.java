/*
    WAP to convert any number from Decimal to Hexadecimal:-
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    int number=sc.nextInt();
	    int n=16;
	    String string1="";
	    int temp=number;
	    //char c[]=string1.toCharArray();
	    while(temp>0)
	    {
	        int rem=temp%n;
	        if(rem==10)
	        {
	            char rem1='A';
	            string1=rem1+string1;
	        }
	        else if(rem==11)
	        {
	            char rem1='B';
	            string1=rem1+string1;
	        }
	        else if(rem==12)
	        {
	            char rem1='C';
	            string1=rem1+string1;
	        }
	        else if(rem==13)
	        {
	            char rem1='D';
	            string1=rem1+string1;
	        }
	        else if(rem==14)
	        {
	            char rem1='E';
	            string1=rem1+string1;
	        }
	        else if(rem==15)
	        {
	            char rem1='F';
	            string1=rem1+string1;
	        }
	        else
	        {
	            string1=rem+string1;
	        }
	        temp=temp/n;
	    }
	    System.out.println("Hexadecimal of that number is: "+string1);
	}
}
