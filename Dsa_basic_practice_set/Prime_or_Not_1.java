import java.util.Scanner;

public class Prime_or_Not_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  integers: ");
        int n = sc.nextInt(); // Number of integers
        Intial_code(n);
        optimized_code(n);
    }
    public static void Intial_code(int n){
        int count =0;
        for(int div=1;div<=n;div++){
            if (n%div==0) {
                count++;
            }
        }
        if (count ==2) {
            System.out.println(n+" is a prime number");
        }else{
            System.out.println(n+" is not a prime number");
        }
    }
    public static void optimized_code(int n){
        int count = 0;
        for(int i=2;i*i <=n;i++){
            if (n%i==0) {
                count++;
                break;
            }
        }
        if (count ==0) {
            System.out.println(n+" is a prime number");
            }else{
                System.out.println(n+" is not a prime number");
}
    }
}
