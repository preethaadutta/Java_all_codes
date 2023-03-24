import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter 1st number: ");
	    int a=sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int b=sc.nextInt();
		//System.out.println("Enter 3rd number: ");
		//int c=sc.nextInt();
		int lcm=0;
		int max=0;
		/* //have to find maximum
		if(a>b)
		{
		    max=a;
		}
		else
		{
		    max=b;
		}
		*/
		max=(a>b)?a:b; //same as above
		if((max%a==0)&&(max%b==0))
		{
		    lcm=max;
		}
		System.out.println("lcm is: "+lcm);
	}
}
