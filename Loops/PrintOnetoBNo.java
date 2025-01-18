import java.util.Scanner;

public class PrintOnetoBNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n = sc.nextInt();
        System.out.println("Where you want to end");
        int m = sc.nextInt();
        for (int i = n; i <=m; i++) {
            System.out.println(i);
        }
    }
}
