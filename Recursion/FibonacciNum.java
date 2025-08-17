public class FibonacciNum {

    public static int fib(int nums){
        if (nums ==0 || nums == 1) {
            return nums;
            
        }
        int fnm1 = fib(nums - 1);
        int fnm2  = fib(nums -2);

        int fn = fnm1 + fnm2;
        return fn;
    }

    static long fact(long num){
        if (num == 0) {
            return 1;
        }
        long fnm1  = fact(num - 1);
        long fact = num * fnm1;
        return fact;
    }
    public static void main(String[] args) {
        long num = 20;
        // System.out.println("Fibonacci of " + num + " is: " + fib(num));
        System.out.println("Factorial of " + num + " is: " + fact(num));
        // Print Fibonacci series up to the nth number
    }
}
