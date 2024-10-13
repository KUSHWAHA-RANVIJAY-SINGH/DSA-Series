import java.util.*;
public class Basic{
    public static void main(String[] args) {
        // int [] arr={1,23,4,5,23,64,75};
        // for (int i : arr) {
        //     System.out.println(i);
        // }
        Scanner sc =new Scanner(System.in);
        int [] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the number "+(i+1)+" ");
            arr[i]=sc.nextInt();
        }
        // for (int i : arr) {
        //     System.out.println("Your Number is "+(i));
        // }

        for(int i=0;i<arr.length;i++){
            System.out.println("Your Number is "+(i+1) +" "+ arr[i]);;
        }
    }

}