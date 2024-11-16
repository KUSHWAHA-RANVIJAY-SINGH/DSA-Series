package Pattern;

import java.util.Scanner;

public class Pattern_1 {
   
    /**
     * InnerPattern_1
     */
     static void InnerPattern_1(int n) {
    

         
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void InnerPattern_2(int n){

        // * * * * *
         // * * * *
         // * * *
         // * *
         // *

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print("* ");
        //         }
        //     System.out.println();
        // }

        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            
        }
    }

    static void InnerPattern_3(int n){
        int sp =0;
        int st =n;

        for (int i = 1; i <=n; i++) {
          for (int j = 1; j <=sp; j++) {
            System.out.print("\t");
          }

          for (int j = 1; j <= st; j++) {
            System.out.print("\t*");
          }
          sp++;
          st--;
          System.out.println();
        }
    }
    static void pattern_5(int n){
        int sp=0;
        int st=n;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=sp; j++) {
                System.out.print("\t");                
            }
            for (int j = 1; j <= st; j++) {
                System.out.print(j +"\t");
            }
            sp++;
            st--;
            System.out.println();
            
        }
    }

    // Factorial 

    static void Factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;  
        }
        System.out.println("Factorial of "+n+" is "+fact);


    }

    public static void main(String[] args) {
        // Scanner sc =new Scanner(System.in);
        // System.out.println("Enter the Number of print the star :");
        // int n = sc.nextInt();

    //    InnerPattern_5(5);
      pattern_5(5);
      Factorial(5
      );
    }
}
