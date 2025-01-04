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
    }
}