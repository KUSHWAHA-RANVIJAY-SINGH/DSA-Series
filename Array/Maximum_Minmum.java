import java.util.Arrays;

public class Maximum_Minmum {
    //max_min using sort function 
    public static void max_min(int []arr){
        Arrays.sort(arr);
        System.out.println("Maximum element is: "+arr[arr.length-1]);
        System.out.println("Minimum element is: "+arr[0]);
    }

    //using_math function is more efficient than using_condition function
    static void using_math(int [] arr){
      if (arr == null || arr.length==0) {
        return;
      }
      int min=arr[0];
      int max=arr[0];
      for (int i = 1; i < arr.length; i++) {
        min =Math.min(min, arr[i]);
        max =Math.max(max, arr[i]);
      }
      System.out.println("Maximum element is: "+max);
      System.out.println("Minimum element is: "+min);
    }
//using_condition function is less efficient than using_math function
    static void using_condition(int [] arr){
        if (arr == null || arr.length==0) {return;}
        int min=arr[0];
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min =arr[i];
            }if (arr[i]>max) {
                max =arr[i];
            }
        }
        System.out.println("Maximum element is: "+max);
        System.out.println("Minimum element is: "+min);
    }
    public static void main(String[] args) {
        int[] arr = {12, 24, 34, 465, 5,86};
        // max_min(arr);
        using_math(arr);
        using_condition(arr);
    }
}
