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
		System.out.println("Enter 3rd number: ");
		int c=sc.nextInt();
		int gcd=0;
		for(int i=1;i<=a && i<=b && i<=c;i++)
		{
		    if((a%i==0)&&(b%i==0)&&(c%i==0))
		    {
		        gcd=i;
		    }
		}
		System.out.println("GCD or HCF is: "+gcd);
	}
}
