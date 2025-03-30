public class Inverted_Star {
    public static void main(String[] args) {
       
        invert_star(8);
        right_way(8);
        half_pattern_number(8);
        print_char(5);
    }

    public static void invert_star(int n){
        for(int i=1;i<=n;i++){
            for(int star=1;star<=n-i+1;star++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void right_way(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void half_pattern_number(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void print_char(int n){
        char ch= 'A';
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.err.print(ch);
                ch++;
            }
            System.err.println();
        }
    }
}

