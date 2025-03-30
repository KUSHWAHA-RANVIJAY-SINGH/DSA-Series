import java.util.LinkedList;

public class First {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        // list.add("A");
        // list.add("B");
        // list.add("C");
        // list.add("D");
        // list.add("E");
        // list.addFirst("R");
        // list.addLast("Y");
        // System.out.println(list);

        // list.remove(2);
        // list.removeFirst();
        // list.removeLast();
        // System.out.println(list);

        // list.set(2, "M");
        // System.out.println(list);

        list.add("Ranvijay");
        list.add("Singh");
        System.out.println(list);
        list.add(1,"Kushwaha");
        System.out.println(list);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        for(String st:list){
            System.out.println(st);
        }
    }
}
