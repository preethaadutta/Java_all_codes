//ArrayList of ArrayLists
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        //we've to create n ArrayLists one by one and concatenate or append to the master ArrayList
        int n=3; 
        //creating an ArrayList of ArrayLists
        ArrayList<ArrayList<Integer>> masterlist=new ArrayList<ArrayList<Integer>>(n);
        //creating n ArrayLists
        ArrayList<Integer> list1=new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        //adding list1 to masterlist
        masterlist.add(list1);
        ArrayList<Integer> list2=new ArrayList<Integer>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        //adding list2 to masterlist
        masterlist.add(list2);
        ArrayList<Integer> list3=new ArrayList<Integer>();
        list3.add(7);
        list3.add(8);
        list3.add(9);
        list3.add(10);
        //adding list3 to masterlist
        masterlist.add(list3);
        
        //iterating over ArrayList of ArrayLists
        for(int i=0;i<masterlist.size();i++)
        {
            for(int j=0;j<masterlist.get(i).size();j++)
            {
                System.out.print("Elements of ArrayList of ArrayLists are: "+masterlist.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}