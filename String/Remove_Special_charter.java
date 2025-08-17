//Write a java program to remove all the special character from the string.
public class Remove_Special_charter {
    public static void main(String[] args) {
        String str = "Hello, World! How are you?";
        System.out.println("Original String: " + str);

        String st = str.replaceAll("[^a-zA-Z0-9]"," ");
        System.out.println(st);
    }
}
