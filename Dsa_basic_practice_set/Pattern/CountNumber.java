import java.util.*;
public class CountNumber {
    
    static int CountNumberdigit(int n){
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }
    private static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }

    private static int gcd(int a ,int b){
        while (b !=0) {
            int temp = b;
            b = a%b;
            a= temp;
        }
        return a;
    }
    public static void main(String[] args) {
        // int n =100;
        // System.out.println("Number of digits in " + n + " is " + CountNumberdigit(n));
        // int [] arr  ={1,3,4,56,6};
        // System.out.println(arr.length);

        int a=2,b=4;
        System.out.println("LCM of " + a + " and " + b + " is " + lcm(a, b));
    }
}