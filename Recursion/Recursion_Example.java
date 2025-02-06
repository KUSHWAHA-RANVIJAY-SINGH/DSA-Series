public class Recursion_Example {
    public static void printNum(int n){
        if (n ==6) {
            return;
        }
        System.out.println(n);
        printNum(n+1);

    }

    static void printsum(int i,int n, int sum){
        if (i==n) {
            sum +=i;
            System.out.println(sum);
            return;            
        }
        sum +=i;
        printsum(i+1, n, sum);
        // System.out.println(i);
    }
    public static void main(String[] args) {
        int n = 1;
        printNum(n);
        printsum(1,5,0);
    }
}
