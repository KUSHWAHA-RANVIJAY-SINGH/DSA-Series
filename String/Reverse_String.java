
public class Reverse_String {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--){
            sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());
        System.out.println(sb.getClass().getName());
         
        String result = sb.toString();
        System.out.println(result);
        System.out.println(result.getClass().getName());
    }
}
