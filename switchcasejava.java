import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner in=new Scanner(System.in);
	    System.out.println("Enter value of the first number=");
	    int a=in.nextInt();
		System.out.println("Enter value of the second number=");
		int b=in.nextInt();
		System.out.println("Enter what calculation you want to do:");
		int choice=in.nextInt();
		int result;
        float result1;
        switch(choice)
        {
    	        case 1:
    		          result=a+b;
    		          System.out.println("Adding two numbers="+result);
    		          break;
    	        case 2:
    		          if(a>b)
    		          {
		                     result=a-b;
		                     System.out.println("Substracting two numbers="+result);	
		               }
		               else
		               {
		                     result=b-a;
		                     System.out.println("Substracting two numbers="+result);	
		               }
		               break;
	            case 3:
		               result=a*b;
		               System.out.println("Multipling two numbers="+result);
		               break;
	            case 4:
		               if(a>b)
    		           {
		                    result1=a/b;
		                    System.out.println("Dividing two numbers="+result1);	
		               }
		               else
		               {
		                    result1=b/a;
		                    System.out.println("Dividing two numbers="+result1);
		               }
		                break;
	            default:
		                System.out.println("No choice found");
            }
	}
}
