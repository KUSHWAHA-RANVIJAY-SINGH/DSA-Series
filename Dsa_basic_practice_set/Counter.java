
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
        int numberofdigit = count(n);
        System.out.println("The number of digit in "+n +" is: " +numberofdigit);
        int count =0;
        while (n>0) {
            n =n/10;
            count++;
        }
        System.out.println(count);
    }

    
}
