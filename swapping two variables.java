//WAP to swap two variables using third variable and without using third variable

import java.util.*;
public class Main
{
    public static void main(String []args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("a= ");
        int a=in.nextInt();
        System.out.print("b= ");
        int b=in.nextInt();
        //swapping using third variable
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("New value of a= "+a);
        System.out.println("New value of b= "+b);
        //swapping without using third variable
        a=a+b; 
		b=a-b;
		a=a-b;
		System.out.println("New value of a= "+a);
        System.out.println("New value of b= "+b);
    }
}