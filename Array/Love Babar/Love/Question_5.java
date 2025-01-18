import java.util.Arrays;

//Move all the negative elements to one side of the array
//Time complexity: O(n)
//Space complexity: O(n)
public class Question_5 {
    public static void move(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        // Store positive elements in temp array
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                temp[j++] = arr[i];
            }
        }
        // Store negative elements in temp array
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temp[j++] = arr[i];
            }
        }
        // Copy temp array to original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        move(arr);
        for (int e : arr)
            System.out.print(e + " ");
    }
}
