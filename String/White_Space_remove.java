//Write a program to remove the all space between given string.
public class White_Space_remove {

    public static void main(String[] args) {
        String str = "   Ranviay   Kushwaha   ";
        System.out.println("Original String: " + str);
        // System.out.println("String after removing white spaces: " + str.trim()); // The trim() method in Java is a built-in method of the String class that removes any leading and trailing whitespace from a string. This can be particularly useful when you need to clean up user input or format strings before processing them.

        String str1 = str.replaceAll("\\s","");
        System.out.println(str1);
    }
}