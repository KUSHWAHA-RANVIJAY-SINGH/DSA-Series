import java.util.Scanner;

public class Bar_Chart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of an Array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        System.out.println("Bar Chart of the Array: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max) {
                max = array[i];
            }
        }

        for (int floor = max; floor >=1; floor--) {
            for (int i = 0; i < array.length; i++) {
                if (array[i]>=floor) {
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}
