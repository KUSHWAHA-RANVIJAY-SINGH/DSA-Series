import java.util.Scanner;

public class Gcd_Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 =sc.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = sc.nextInt();

        int org1=n1;
        int org2=n2;
        while (n1%n2 != 0) {
            int rem =n1%n2;
            n1=n2;
            n2=rem;
        }
        int gcd = n2;
        int lcm = (org1*org2)/gcd;
        System.out.println("GCD of "+org1+" and "+org2+" is "+gcd);
        System.out.println("LCM of "+org1+" and "+org2+" is "+lcm);
    }
}
