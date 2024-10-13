import java.util.HashMap;
import java.util.Map;

public class Dictionaries_and_Maps {
    public static void main(String[] args) {
        Map<String,Integer> m=new HashMap<String,Integer>();

        m.put("mohan", 3423453);
        m.put("rohan", 3423454);
        m.put("raju", 4343);

        m.containsKey("mohan");
        System.out.println(m.get("raju"));
        if (m.containsKey("rohan")) {
            System.out.println(m.get("rohan"));
        }
    }
}
