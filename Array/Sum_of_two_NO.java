import java.util.Scanner;

public class Sum_of_two_NO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array a1: ");
        int n1 = sc.nextInt();
        int [] a1 =new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the array a2: ");
        int n2 = sc.nextInt();
        int [] a2 =new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }

        System.out.println("Enter the sum: ");
        int[] sum =  new int[n1>n2?n1:n2];
        int carry = 0;

        int i = a1.length-1;
        int j = a2.length-1;
        int k = sum.length-1;

        while (k>=0) {
            int digit = carry;
            if (i>=0) {
                digit += a1[i];
            }
            if (j>=0) {
                digit += a2[j];
            }
            carry = digit/10;
            digit = digit%10;
            sum[k] = digit;

            i--;
            j--;
            k--;

        }
        if (carry!=0) {
            System.out.println(carry);
        }
        else {
            System.out.println("No carry");
        }
      
        for (int val : sum) {
            System.out.print(val+" ");
        }
    }
}
