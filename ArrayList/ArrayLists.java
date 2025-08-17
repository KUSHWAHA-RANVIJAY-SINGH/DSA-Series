//Array list in java
// An ArrayList in Java is a resizable array, which can be found in the java.util package. Unlike arrays, ArrayLists can dynamically grow and shrink as you add or remove elements. Here are some key points about ArrayLists:

import java.util.Collections;
import java.util.ArrayList; 
public class ArrayLists{
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        
        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Apple");
        System.out.println(list);

        //get 
        String element = list.get(0);
        System.out.println(element);

        //set list 
        list.set(0,"Mohan");
        System.out.println(list);

        //Delete list element 

        list.remove(0);
        System.out.println(list);

        //sorting 
        Collections.sort(list);
        System.out.println(list);

        System.out.println(list.toString());

        for(String value : list){
            System.out.println(value);
        }
    }
}