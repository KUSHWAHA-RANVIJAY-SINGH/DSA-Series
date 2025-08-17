public class String_BufferEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");

        sb.append("Mohan");
        // sb.reverse();
        sb.capacity();
        sb.insert(0,"Ram ");
        sb.replace(0, 12 , "Jai Shree Ram ");
        // sb.delete(1, 15);
        System.out.println(sb.charAt(4));
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb);
    }
}
