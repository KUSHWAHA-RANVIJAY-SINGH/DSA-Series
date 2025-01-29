import java.util.*;
public class HashmapExamp {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String,Integer> map = new HashMap<>();

        map.put("India", 140);
        map.put("USA", 30);
        map.put("China", 160);
        System.out.println(map);

        //check the value is exists or not in the hashmap. if value is does not exists then return the null value.

        // System.out.println(map.get("India"));

        //Search 
        // if (map.containsKey("China")) {
        //     System.out.println("key is present in the map");
        // }else{
        //     System.out.println("key is not present in the map");
        // }

        // //Iteration in Hashmap
        // //map.Entry<Integer,Integer> e: map.entryset();

        // for(Map.Entry<String,Integer> e:map.entrySet()){
        //     System.out.println(e.getKey()+" "+e.getValue());
        // }

        // //Second method of Iteration.
        // Set<String> keys = map.keySet();
        // for(String key:keys){
        //     System.out.println(key +" "+map.get(key));
        // }

        // remove the element from the map.
        map.remove("China");
        System.out.println(map);
    }
}
