//WAP to find squareroot of any number:-
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter the number=");
	    int a=in.nextInt();
		int squareroot=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                if(i*i==a)
                {
                    squareroot=i;
                }
            }
        }
        if(squareroot==0)
        {
            squareroot=0;
            System.out.println("Square root is="+squareroot);
        }
        else
        {
            System.out.println("Square root is="+squareroot);
        }
	}
}
