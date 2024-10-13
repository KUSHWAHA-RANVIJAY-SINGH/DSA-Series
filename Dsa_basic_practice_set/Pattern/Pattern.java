package Pattern;

public class Pattern {
    public static void main(String[] args) {
        pattern_1(4);
      
    }

    static void pattern_1(int n){
        for (int i = 0; i <= n; i++) {
            for(int j=0;j<=i;j++){
                System.out.print("Mandal pandey ");
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern_2(int n){
        for (int row = 0; row <= n; row++) {
            for(int col=0;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern_3(int n){
        for (int row = 1; row <=n; row++) {
            for(int col=1;col<=n-row+1;col++){
                System.out.println("Rnau mandal");
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern_4(int n){
        for (int row = 1; row <=n; row++) {
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    
    static void pattern_5(int n){
        for (int row = 1; row <=n; row++) {
            for(int col=1;col<=n-row+1;col++){
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }
    
    
}
