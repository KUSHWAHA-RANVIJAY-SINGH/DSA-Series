import java.util.HashSet;

public class Hashset_Ex {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> set = new HashSet<String>();

        // Adding elements into the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Orange");
        set.add("Pineapple");

        // Adding duplicate elements
        set.add("Apple");

        // Displaying the HashSet
        System.out.println(set);

        // Removing items from HashSet using remove()
        set.remove("Apple");
        System.out.println(set);

        // Checking if the element is present
        System.out.println(set.contains("Apple"));       
        
        //Size of the HashSet
        System.out.println(set.size());

        //Clear the HashSet
        set.clear();
        System.out.println(set);
    }
}
