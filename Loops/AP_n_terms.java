import java.util.Scanner;

public class AP_n_terms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number");
        int n = sc.nextInt();
        for(int i=1;i<=2*n-1;i+=2){
            System.out.println(i);
        }


    }
}
