import java.util.Arrays;

public class PairSum {
    // Brute force method
    public static int pairSum(int[] arr, int target) {
        int count = 0, sum;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if (sum == target) {
                    ++count;
                }
            }
        }
        return count;
    }

    // Optimal two-pointer method
    public static int optimalpairSum(int[] array, int target) {
         Arrays.sort(array);
        int count = 0, sum;
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            sum = array[start] + array[end];
            if (sum == target) {
                count++;
                start++;
                end--;
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] array = {4, 1, 2, 3, 4, 5};
        int target = 6;
        System.out.println("Number of pairs with sum " + target + " is " + pairSum(arr, target));
        System.out.println("Number of pairs with sum " + target + " is " + optimalpairSum(array, target));
    }
}
