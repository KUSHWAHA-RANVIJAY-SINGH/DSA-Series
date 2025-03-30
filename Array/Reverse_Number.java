public class Reverse_Number {
    public static void main(String[] args) {
        int num = 343;
        plaindromeNumber(num);
        int Original_number = num;
        int reversed_num = 0;

        while (num != 0) {
            int remainder = num % 10;
            reversed_num = reversed_num *10 +remainder;
            num = num / 10;
           

        }
        System.out.println("Reversed Number is: "+reversed_num);
        if (Original_number == reversed_num) {
            System.out.println("It is a palindromeNumber.");
        }else{
            System.out.println("It is not a palindromeNumber.");
        }

    }
    public static void plaindromeNumber(int n){
        int temp = n;
        int reversed_num = 0;
        while (temp != 0) {
            int remainder = temp%10;
            reversed_num = reversed_num *10+remainder;
            temp = temp/10;
        }
        if (n == reversed_num) {
            System.out.println(n + " is a palindrome number");
        }else{
            System.out.println(n + " is not a palindrome number");
        }
    }
public static String reverseString(String input) {
    StringBuilder reversed = new StringBuilder(input);
    return reversed.reverse().toString();
}

public static void reverseStringArray(String[] arr) {
    int left = 0, right = arr.length - 1;
    while (left < right) {
        String temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
}
}
