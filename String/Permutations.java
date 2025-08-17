import java.util.HashSet;  

public class Permutations {  

    // Method to generate permutations  
    public static int permute(String str, int left, int right) {  
        int count = 0; // Counter for the number of unique permutations  

        // Base case: if left index equals right index, we have a complete permutation  
        if (left == right) {  
            System.out.println(str);  
            return 1; // Return 1 for each complete permutation  
        } else {  
            HashSet<Character> swappedCharacters = new HashSet<>(); // To avoid duplicates  
            for (int i = left; i <= right; i++) {  
                // Check if the character at this index has already been swapped  
                if (swappedCharacters.add(str.charAt(i))) { // only proceed if it's a new character  
                    // Swap the characters at indices left and i  
                    str = swap(str, left, i);  
                    // Generate permutations for the remaining characters  
                    count += permute(str, left + 1, right);  
                    // Backtrack (swap back)  
                    str = swap(str, left, i);  
                }  
            }  
        }  
        return count; // Return the total count of unique permutations  
    }  

    // Method to swap two characters in a string  
    private static String swap(String a, int i, int j) {  
        char temp;  
        char[] charArray = a.toCharArray();  
        temp = charArray[i];  
        charArray[i] = charArray[j];  
        charArray[j] = temp;  
        return String.valueOf(charArray);  
    }  

    // Main method to run the program  
    public static void main(String[] args) {  
        String str = "abc"; // You can change this string to generate permutations of other inputs  
        int totalPermutations = permute(str, 0, str.length() - 1);  
        System.out.println("Total unique permutations: " + totalPermutations);  
    }  
}