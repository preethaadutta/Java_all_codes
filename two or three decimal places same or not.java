//Question 26: Write a Java program that accepts two floatingpoint numbers and checks whethe they are the same up 
//to two decimal places.

// Write a Java program that reads in two floating-point numbers and tests whether they are the same up to 
//three decimal places.
//Input : 25.654                 Input : 32.654
//Input : 25.65478               Input : 25.65478
//Output: True                   Output: False
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 1st floating point value: ");
        String string1=in.nextLine();
        String parts1[]=string1.split("[.]+");
        System.out.println("Enter 2nd floating point value: ");
        String string2=in.nextLine();
        String parts2[]=string2.split("[.]+");
        String integerPart1=parts1[0];
        String fractionalPart1=parts1[1];
        String integerPart2=parts2[0];
        String fractionalPart2=parts2[1];
        if(integerPart1.equals(integerPart2)==false) //equals() method checks whether two strings are eual or not
        {
            System.out.println("False");
        }
        else
        {
        //substring(starting index,ending index) method returns all the substrings in the given index of a string
            String part1=fractionalPart1.substring(0,3); 
            String part2=fractionalPart2.substring(0,3);
            if(part1.equals(part2)==true)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}