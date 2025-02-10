import java.util.Scanner;

public class Prime_or_Not {
 
    static boolean prime_or_not(int num){
        if (num<=1) {
            return false;
        }else{
            for(int i=2;i<=Math.sqrt(num);i++){
                if (num %i==0) {
                    return false;
                }
            }
        }
        return true;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (prime_or_not(num)) {
            System.out.println(num +" is a prime number");
        }else{
            System.out.println(num +" is not a prime number");
        }
        
        
        
    //     System.out.println("Enter a number :");
    //     int low= sc.nextInt();
    //     int high =sc.nextInt();
        
   
       
    //             for (int i = 0; i < n; i++) {
    //         int t=sc.nextInt();
    //         int count = 0;
    //         for(int div=1;div<=t;div++){
    //             if(t%div==0){
    //                 count++;
    //         }
    //     }
    //     if (count ==2 ) {
    //         System.out.println("Prime");
    //     }else{
    //         System.out.println("Not Prime");
    //     }
    //     }
    // }

    static void Isprime(int n){
        int count =0;
        for(int div=2;div *div <=n;div++){
            if(n%div==0){
                count++;
                break;
            }

        }
        if (count ==0) {
            System.out.println(n+" Is prime");
        }
        else{
            System.out.println(n+ " Not prime");
        }

    }




    // *? Reverse Number 
     
    // int number =sc.nextInt();
    // while(number>0){
    //     int rem =number%10;
    //     number =number/10;
    //     System.out.print(rem);
    // }
}