import java.lang.*;
public class Main
{
	public static void main(String[] args) 
	{
	    int array1[]={0,1,2,3,4};
	    int array2[]={5,6,7,8};
	    int n1=array1.length;
	    int n2=array2.length;
	    int n3=n1+n2;
	    int array3[]= new int[n3];
	    System.arraycopy(array1,0,array3,0,n1);
	    System.arraycopy(array2,0,array3,n1,n2);
	    for(int i=0;i<n3;i++)
        {
            System.out.print(array3[i]+" ");
        }
	}
}
