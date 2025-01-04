public class SumofDigit {
  
    public static void ProductofDigit(int number ,int mul) {
     
        while(number!=0){
            int lastdigit = number % 10;
             mul =  mul+ lastdigit;
            number =number/10;
        }
        System.out.println("Multiply of digit is " + mul);

    }
    public static void main(String[] args) {
        ProductofDigit(12345, 1);
        int n = 12345;
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
            }
            System.out.println("Sum of digit is " + sum);

    }

}
