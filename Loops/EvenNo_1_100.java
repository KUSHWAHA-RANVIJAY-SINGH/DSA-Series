public class EvenNo_1_100 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }
        
        System.out.println();
        for (int i = 1; i <= 100; i++) {
            if (i%3 == 0) {
                System.out.println(i);
            }
        }
    }
}
