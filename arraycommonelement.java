//WAP to print common elements among two arrays
//Input:array1:[3,2,9,4,7]
//      array2:[0,8,2,1,3,7]
//Output:Common elements are: 2 3 7
//Using Hashing technique:-

import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of elements in 1st array: ");
        int n1=in.nextInt();
        int array1[]=new int[n1];
        for(int i=0;i<n1;i++)
        {
            System.out.print("Enter elements in 1st array: ");
            array1[i]=in.nextInt(); //array1:[3,2,9,4,7]
        }
        System.out.print("Enter number of elements in 2nd array: ");
        int n2=in.nextInt();
        int array2[]=new int[n2];
        for(int i=0;i<n2;i++)
        {
            System.out.print("Enter elements in 2nd array: ");
            array2[i]=in.nextInt(); //array2:[0,8,2,1,3,7]
        }
        int max=Integer.MIN_VALUE; 
        for(int element1:array1) //for-each loop
        {
            if(element1>=max)
            {
                max=element1; //max=9; from array1
            }    
        }
        for(int element2:array2) //for-each loop
        {
            if(element2>=max)
            {
                max=element2; //max=9 because 8 is maximum from array2 but 8<9
            } 
        }
        int array3[]=new int[max+1]; //max+1 means 9+1=10 elements in array3[] 
        for(int i=0;i<array3.length;i++) //i<max+1 //same
        {
            array3[i]=0; //putting all elements of array3[] as zero array3=[0,0,0,0,0,0,0,0,0,0]
        }
        for(int el1:array1) //for-each loop taking elements of array1
        {
            array3[el1]++; //array3=[0,0,1,1,1,0,0,1,0,1]
        }
        for(int el2:array2) //for-each loop taking elements of array2
        {
            array3[el2]++; //array3=[1,1,2,2,1,0,0,2,1,1]
        }
        System.out.println("Common elements are:");
        for(int i=0;i<array3.length;i++) //i<max+1 //same
        {
            if(array3[i]>1) //checking which elements of array3 is 2 because the index of those elements are the 
            //common elements among 2 arrays
            {
                System.out.print(i+" ");
            }
        }
    }
}