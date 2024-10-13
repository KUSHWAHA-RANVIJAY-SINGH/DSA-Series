
import java.util.Scanner;

public class Counter {
    static int count(int n){
        int count =0;
        while (n>0) {
            n=n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        prime(n);
        System.out.println();
    }

    static void prime(int n){
        int count =0;
        for (int div = 1; div<= n; div ++) {
            if (n%div ==0) {    
                count++;                
            } 
        }
        if (count ==2) {
            System.out.println(n+" is a prime number");
            
        }
        else{
            System.out.println(n+"is not a prime number");
        }
    }
}
