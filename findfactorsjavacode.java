import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner in=new Scanner(System.in);
	    int number;
	    System.out.print("Enter a number=");
	    number=in.nextInt();
	    System.out.print("Factors of the number are=");
	    for(int i=1;i<=number;i++)
	    {
	        if(number%i==0)
	        {
	            System.out.print(i);
	        }
	    }
		
	}
}
