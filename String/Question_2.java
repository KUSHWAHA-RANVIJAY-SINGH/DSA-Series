//Check whether a String is Palindrome or not.

import java.util.Scanner;

public class Question_2 {
    boolean  isPalindrome(String str){
        // StringBuilder sb = new StringBuilder();
        // for (int i = str.length() - 1; i >= 0; i--){
        //     sb.append(str.charAt(i));
        // }
        // String result = sb.toString();
        return str.equals(new StringBuilder(str).reverse().toString());
    }
    public static void main(String[] args) {
        Question_2 obj = new Question_2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        if (obj.isPalindrome(str)){
            System.out.println(str+" "+"is Palindrome ");
        } else {
            System.out.println(str+" Not Palindrome");
        }

    }
}
