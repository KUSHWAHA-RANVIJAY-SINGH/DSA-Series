
public class Square {
    static void printsquare(int n) {
        int i, j;

        for (i = 0; i < n; i++) {

            for (j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void Number_triangle_Pattern(int n) {
        int i, j;
        // outer loop handle the number of columns .
        for (i = 1; i <= n; i++) {
            // inner loop to print space
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // inner loop to print star
            for(j=1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();

        }
        // print new line for each row

    }

    public static void main(String[] args) {
        int n = 6;
        Number_triangle_Pattern(n);
    }
}
