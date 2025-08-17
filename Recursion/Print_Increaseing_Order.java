public class Print_Increaseing_Order {
    
    public static void PrintInc(int num){
       if (num == 1) {
         System.out.print(num+" ");
         return;
        
       }
         PrintInc(num-1);
         System.out.print(num+" ");
        
    }

    public static void main(String[] args) {
        int num =15;
        PrintInc(num);
    }

}
