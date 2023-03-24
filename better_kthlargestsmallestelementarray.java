//WAP to display k'th largest and smallest elements in an array

import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of elements in array:");
        int n=in.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter elements in array:");
            array[i]=in.nextInt();
        }
        int k;
        System.out.print("Enter value of k:");
        k=in.nextInt();
        int ksmallest,klargest;
        //Bubble sort- smallest to largest
        int temp;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(array[j]>array[j+1])
                {
                    //swapping using third variable
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        ksmallest=array[k-1];
        klargest=array[n-k];
        System.out.println("K'th smallest element in array is: "+ksmallest);
        System.out.println("K'th largest element in array is: "+klargest);
    }
}