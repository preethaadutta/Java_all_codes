import java.util.*;
import java.lang.Math;
public class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of elements in array:");
        int N=in.nextInt();
        int array1[]=new int[N];
        for(int i=0;i<N;i++)
        {
            System.out.print("Enter elements in array:");
            array1[i]=in.nextInt();
        }
        //Bubble sort- smallest to largest
        int temp;
        for(int i=0;i<N-1;i++)
        {
            for(int j=0;j<N-1-i;j++)
            {
                if(array1[j]>array1[j+1])
                {
                    //swapping using third variable
                    temp=array1[j];
                    array1[j]=array1[j+1];
                    array1[j+1]=temp;
                }
            }
        }
        int M=in.nextInt();
        int sum1=0;
        for(int i=0;i<M;i++)
        {
            sum1=sum1+array1[i];
        }
        System.out.print("sum1:"+sum1);
        int L=N-M;
        int sum2=0;
        for(int i=N-1;i>M-1;i--)
        {
            sum2=sum2+array1[i];
        }
        System.out.print("sum2:"+sum2);
        int difference1=Math.abs(sum2-sum1);
        System.out.println("difference1:"+difference1);
        int sum3=0;
        for(int i=N-1;i>=L;i--)
        {
            sum3=sum3+array1[i];
        }
        System.out.print("sum3:"+sum3);
        int sum4=0;
        //for(int i=N-1;i>L-2;i--)
        for(int i=0;i<L;i++)
        {
            sum4=sum4+array1[i];
        }
        System.out.print("sum4:"+sum4);
        int difference2=Math.abs(sum3-sum4);
        System.out.println("difference2:"+difference2);
        int result=0;
        if(difference1>difference2)
        {
            result=difference1;
        }
        else
        {
            result=difference2;
        }
        System.out.print("Maxdifference:"+result);
    }
}