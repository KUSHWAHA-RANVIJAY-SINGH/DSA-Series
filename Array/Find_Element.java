import java.util.Scanner;

public class Find_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int [] arr =new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Find element data:");
        int data = sc.nextInt();

        int index =-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {   
                index = i;
            }
        }
        System.out.println(index);
    }
}
