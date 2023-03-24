//Question no:44
//Write a Java program to replace a string "python" with "java" and "java" with "python" in a given string.

import java.util.*;
public class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any sentence: ");
        String input=sc.nextLine();
        String words[]=input.split(" ");
        for(int i=0;i<words.length;i++)
        {
            if(words[i].equals("python"))
            {
                words[i]="java";
            }
            else if(words[i].equals("java"))
            {
                words[i]="python";
            }
        }
        String output="";
        for(String str:words)
        {
            output=output+str+" ";
        }
        System.out.println("Modified String = "+output);
    }
}
