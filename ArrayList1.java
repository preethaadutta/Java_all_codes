//Integer ArrayList
import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list1=new ArrayList<Integer>(); //creating an Integer ArrayList
        //add(element) method is used to add new elements in ArrayList
      //ArrayListname.add(element)
        list1.add(1); 
        list1.add(2); 
        list1.add(3); 
        list1.add(4); 
        list1.add(5); 
        System.out.print("ArrayList is: "+list1); //printing ArrayList
        //add(indexnumber,elementtobeinserted) method is used to add new element in a particular index of ArrayList
      //ArrayListname.add(indexnumber,elementtobeinserted)
        list1.add(3,6); 
        System.out.print(" New ArrayList is: "+list1); //printing
        //ArrayListname.size() method is used to find size of ArrayList
        int sizelist1=list1.size();
        System.out.print(" Size of ArrayList is: "+sizelist1); //printing the size of list1
        //System.out.print(" Size of ArrayList is: "+list1.size()); //printing the size of list1 //same
        //get(indexnumber) method is used to access the element of a particular index of the ArrayList
        System.out.print(" 1th index value of ArrayList is: "+list1.get(1)); //accessing element of that index
        //set(indexnumber,element) method is used to modify that particular index element of ArrayList
      //ArrayListname.set(indexnumber,element)
        list1.set(1,7);
        System.out.print(" Modified ArrayList is: "+list1);
    }
}