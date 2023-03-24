//Sir's code
// WAP to create a basic string compression method using the counts of repeated characters.
//Input : aaaabbbbcccccddddeeee
//Output: a4b4c5d4e4
import java.util.*;
public class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String input=sc.nextLine();
        String unique="";
        String output="";
        for(char ch:input.toCharArray())
        {
            if(unique.contains(ch+"")==false)
            {
                unique=unique+ch;
            }
        }
        for(char ch1:unique.toCharArray())
        {
            int count=0;
            for(char ch2:input.toCharArray())
            {
                if(ch1==ch2)
                {
                    count++;
                }
            }
            output=output+ch1+Integer.toString(count);
        }
        System.out.println("Compressed String = "+output);
    }
}
