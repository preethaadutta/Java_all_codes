//WAP to find given Co-ordinate lies on which quadrant
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner in=new Scanner(System.in);
	    int x,y;
	    System.out.print("x=");
	    x=in.nextInt();
	    System.out.print("y=");
	    y=in.nextInt();
	    if(x==0 && y==0)
	    {
	        System.out.println("Co-ordinate lies on origin");
	    }
	    if(x==0 && y!=0)
	    {
            if(y>0)
	        {
	               System.out.println("Co-ordinate lies on +ve Y axis");
	        }
	        else if(y<0)
	        {
	               System.out.println("Co-ordinate lies on -ve Y axis");
	        }
	    }
	    if(x!=0 && y==0)
	    {
	        if(x>0)
	        {
	               System.out.println("Co-ordinate lies on +ve X axis");
	        }
	        else if(x<0)
	        {
	               System.out.println("Co-ordinate lies on -ve X axis");
	        }
	    }
	    if(x!=0 && y!=0)
	    {
	        if(x>0 && y>0)
	        {
	            System.out.println("Co-ordinate lies on 1st quadrant");
	        }
	        else if(x<0 && y>0)
	        {
	            System.out.println("Co-ordinate lies on 2nd quadrant");
	        }
	        else if(x<0 && y<0)
	        {
	            System.out.println("Co-ordinate lies on 3rd quadrant");
	        }
	        else if(x>0 && y<0)
	        {
	            System.out.println("Co-ordinate lies on 4th quadrant");
	        }
	    }
	}
}
