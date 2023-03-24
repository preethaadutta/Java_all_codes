//WAP to check prime number or not //Java previous Sir's code
import java.util.*;
class Prime
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a No:");
		int a=ob.nextInt();
		int flag=0;
		for(int i=2;i<n;i++)
		{
			if(a%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println(a+" is not prime");
		else
			System.out.println(a+" is prime");
	}
}	