public class PalindromeCheck {
   
        public static boolean isPalindrome(int num) {
            int reversedNum = 0;
            int originalNum = num;
    
            while (num != 0) {
                int digit = num % 10;
                reversedNum = reversedNum * 10 + digit;
                num /= 10;
            }
    
            return originalNum == reversedNum;
        }
    
        public static void main(String[] args) {
            int num = 12321;
            if (isPalindrome(num)) {
                System.out.println(num + " is a palindrome.");
            } else {
                System.out.println(num + " is not a palindrome.");
            }
        }
    }
