import java.util.Arrays;

public class Kth_max_and_min_element {
    public static void main(String[] args) {
       int arr[] = {7, 10, 4, 3, 20, 15};
       int k = 3;

       
         Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]);
        }
            System.out.println("Kth min element is: "+arr[k-1]);
    }
    
}
