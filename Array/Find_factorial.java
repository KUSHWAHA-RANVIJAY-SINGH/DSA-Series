public class Find_factorial {
    public static void main(String[] args) {
        int number = 2;
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 0;
        }
        int fact =1;
        for(int i =1;i<=n;i++){
            fact= fact * i;
        }
        return fact;
    }
}