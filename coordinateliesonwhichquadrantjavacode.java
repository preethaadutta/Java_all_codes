//WAP to find given Co-ordinate lies on which quadrant
import java.util.*;
import java.lang.Math;
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
	        int ty;
	        ty=Math.abs(y);
	        if(ty==y)
	        {
	               System.out.println("Co-ordinate lies on +ve Y axis");
	        }
	        else
	        {
	               System.out.println("Co-ordinate lies on -ve Y axis");
	        }
	    }
	    if(x!=0 && y==0)
	    {
	        int tx;
	        tx=Math.abs(x);
	        if(tx==x)
	        {
	               System.out.println("Co-ordinate lies on +ve X axis");
	        }
	        else
	        {
	               System.out.println("Co-ordinate lies on -ve X axis");
	        }
	    }
	    if(x!=0 && y!=0)
	    {
	        int tempx;
	        int tempy;
	        tempx=Math.abs(x);
	        tempy=Math.abs(y);
	        if(tempx==x && tempy==y)
	        {
	            System.out.println("Co-ordinate lies on 1st quadrant");
	        }
	        else if(tempx!=x && tempy==y)
	        {
	            System.out.println("Co-ordinate lies on 2nd quadrant");
	        }
	        else if(tempx!=x && tempy!=y)
	        {
	            System.out.println("Co-ordinate lies on 3rd quadrant");
	        }
	        else if(tempx==x && tempy!=y)
	        {
	            System.out.println("Co-ordinate lies on 4th quadrant");
	        }
	    }
	}
}
