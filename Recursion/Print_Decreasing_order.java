public class Print_Decreasing_order {
    static void PrintDec(int num){
        if (num == 1) {
            System.out.print(num+" ");
            return;
        }
        System.out.print(num+" ");
        PrintDec(num-1);

    }
    public static void main(String[] args) {
        int num =10;
        PrintDec(num);
    }
}
