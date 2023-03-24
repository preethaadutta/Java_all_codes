//Question no:43
// Write a Java program which reads a text (only alphabetical characters and spaces.) and prints two words. 
//The first one is the word which is used most frequently in the text. The second one is the word which has the 
// maximum number of letters.
//Input1 :Thank you for your comment and your participation.
//Output1:Most frequent text: your
//        Word with maximum length: participation

import java.util.*;
public class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string: ");
        String input=sc.nextLine();
        String words[]=input.split(" ");
        ArrayList<String> uniqueWords=new ArrayList<String>();
        for(String str:words)
        {
            if(uniqueWords.contains(str)==false)
                uniqueWords.add(str);
        }
        // finding the most frequent word
        int maxCount =-1;
        String frequentString ="";
        for(String str1 : uniqueWords)
        {
            int count = 0;
            for(String str2:words)
            {
                if(str1.equals(str2))
                {
                    count++;
                }
            }
            if(count>=maxCount)
            {
                maxCount=count;
                frequentString=str1;
            }
        }
        System.out.println("Most frequent word = "+frequentString);
        // finding the word with highest length
        int maxLength=-1;
        String maxLengthedString="";
        for(String str3:uniqueWords)
        {
            if(str3.length()>=maxLength)
            {
                maxLength=str3.length();
                maxLengthedString=str3;
            }
        }
        System.out.println("Highest Lengthed Word = "+maxLengthedString);
    }
}
