/* WAP to print Repeating or duplicate and Non-repeating or distinct elements in array:- */
//Input:array:[2,1,4,1,2]
//Output:Repeating or duplicate elements are: 1 2
//Output:Non-Repeating or distinct elements are: 4

//Using Hashing Technique:-
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int n=in.nextInt();
        int array1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter elements in array: ");
            array1[i]=in.nextInt(); //array1:[2,1,4,1,2]
        }
        int max=Integer.MIN_VALUE; 
        for(int element:array1) //for-each loop
        {
            if(element>=max)
            {
                max=element; //max=4; from array1
            }    
        }
        int array2[]=new int[max+1]; //max+1 means 4+1=5 elements in array2[] 
        for(int i=0;i<array2.length;i++) //i<max+1 //same
        {
            array2[i]=0; //putting all elements of array2[] as zero array2=[0,0,0,0,0]
        }
        for(int el1:array1) //for-each loop taking elements of array1
        {
            array2[el1]++; //array2=[0,2,2,0,1]
        }
        //To find and print Repeating or duplicate elements of array
        System.out.print("Repeating or duplicate elements are: ");
        for(int i=0;i<array2.length;i++) //i<max+1 //same
        {
            if(array2[i]>1) //checking which elements of array2 are more than 1 because the index of those elements 
            //are the repeating elements in that array
            {
                System.out.print(i+" ");
            }
        }
        System.out.println(); //to go in the new line
        //To find and print Non-Repeating or distinct elements of array
        System.out.print("Non-Repeating or distinct elements are: ");
        for(int i=0;i<array2.length;i++) //i<max+1 //same
        {
            if(array2[i]==1) //checking which elements of array2 are equal to 1 because the index of those elements 
            //are the non-repeating elements in that array
            {
                System.out.print(i+" ");
            }
        }
    }
}

/* Output in this format:
Enter number of elements in array: 5
Enter elements in array: 2
Enter elements in array: 1
Enter elements in array: 4
Enter elements in array: 1
Enter elements in array: 2
Repeating or duplicate elements are:1 2 
Non-Repeating or distinct elements are:4
*/



