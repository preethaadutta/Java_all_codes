//WAP to split a sentence into words
/*
Input: Enter a sentence: 
       Java is one of the popular languages
Output:Java
       is
       one
       of
       the
       popular
       languages 
*/

import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String string=in.nextLine();
        //split() method of string class splits a string and stores the splited parts into array
        String words[]=string.split(" "); //words[] is an array //delimeter is space here 
        //Traversing words[] array using for-each loop 
        //for(String w:words)
        //{
            //System.out.println(w);
        //}
        //Traversing words[] array using for loop 
        for(int i=0;i<words.length;i++)
        {
            System.out.println(words[i]);
        }
    }
}