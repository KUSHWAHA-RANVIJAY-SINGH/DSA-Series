import java.lang.*;

public class PalindromeSting {
    public static boolean isPalindrome(String s) {
        String clenstring = s.replace("[^a-zA-Z0-9]", "").toLowerCase();

        return clenstring.equals(new StringBuilder(clenstring).reverse().toString());
    }

    public static void main(String[] args) {
        String inputString = "Raju";
        System.out.println(new StringBuffer(inputString.toLowerCase()).reverse() );
        if (isPalindrome(inputString)) {
            System.out.println("\"" + inputString + "\" is a palindrome.");
        } else {
            System.out.println("\"" + inputString + "\" is not a palindrome.");
        }

      
    }
}
