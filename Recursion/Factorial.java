public class Factorial {
    // Function to calculate factorial using recursion
    static int factorial(int num){
        if (num ==0) {
            return 1;
        }
        int fnm1 = factorial(num -1);
        int fn = num * fnm1;
        return fn;
    }
    // Print the sum of the first n natural numbers using recursion

    static int calsum(int num){
        if (num == 1) {
            return 1;
        }
        int Snm1 = calsum(num - 1);
        int Sum = num + Snm1;
        return Sum;
    }

    // Check if Array is sorted using recursion
    static boolean isSorted(int arr[], int i){
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }
    

    public static void main(String[] args) {
        int num = 5;
        int arr[] = {1, 2, 3, 4, 5,9,5};
        // Check if the array is sorted
        System.out.println("Is the array sorted? " + isSorted(arr, 0));

        // // Calculate the sum of the first n natural numbers
        // System.out.println("Sum of first " + num + " natural numbers is: " + calsum(num));
        // // Calculate the factorial of the number
        // System.out.println("Factorial of " + num + " is: " + factorial(num));
    }
}
