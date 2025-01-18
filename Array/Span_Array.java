import java.util.Scanner;

public class Span_Array {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
         int n  =sc.nextInt();
        int [] arr =new int[n];
       for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
       }

       int max =arr[0];
       int min = arr[0];
       for (int i = 1; i < arr.length; i++) {
         max= Math.max(max, arr[i]);
         min = Math.min(min, arr[i]);
       }

       System.out.println("Maximum number is :" +max);
       System.out.println("Minimum number is :" +min);
        int span = max -min ;
        System.out.println("Difference between max and min element is:"+span);
    }
}
