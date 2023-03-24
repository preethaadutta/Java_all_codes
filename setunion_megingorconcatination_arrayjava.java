// Write a JAVA program to perform set Union operation or merging or concatination of 2 given integer arrays
//Input:array1:[1,2,3,4,5]
//      array2:[6,7,8,9,10]
//Output:[1,2,3,4,5,6,7,8,9,10]

//Using Hashing technique

import java.util.*;
public class Main
{
    public static void main(String []args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of elements in 1st array: ");
        int n1=in.nextInt();
        int array1[]=new int[n1];
        for(int i=0;i<n1;i++)
        {
            System.out.print("Enter elements in 1st array: ");
            array1[i]=in.nextInt();
        }
        System.out.print("Enter number of elements in 2nd array: ");
        int n2=in.nextInt();
        int array2[]=new int[n2];
        for(int i=0;i<n2;i++)
        {
            System.out.print("Enter elements in 2nd array: ");
            array2[i]=in.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int element1:array1) //for-each loop
        {
            if(element1>=max) 
            {
                max=element1;
            }
        }
        for(int element2:array2) //for-each loop
        {
            if(element2>=max) 
            {
                max=element2;
            }
        }
        int array3[] = new int[max+1]; 
        for(int i=0;i<array3.length;i++)
        {
            array3[i]=0;
        }
        for(int el1:array1) //for-each loop
        {
            array3[el1]++;
        }
        for(int el2:array2) //for-each loop
        {
            array3[el2]++;
        }
        System.out.println("Elements of Set Union operation are:");
        for(int k=0;k<array3.length;k++)
        {
            if(array3[k]!=0)
            {
                System.out.print(k+" ");
            }
        }
    }
}
/*
output:
Enter number of elements in 1st array: 5
Enter elements in 1st array: 1
Enter elements in 1st array: 2
Enter elements in 1st array: 3
Enter elements in 1st array: 4
Enter elements in 1st array: 5
Enter number of elements in 2nd array: 5
Enter elements in 2nd array: 6
Enter elements in 2nd array: 7
Enter elements in 2nd array: 8
Enter elements in 2nd array: 9
Enter elements in 2nd array: 10
Elements of Set Union operation are:
1 2 3 4 5 6 7 8 9 10
 */