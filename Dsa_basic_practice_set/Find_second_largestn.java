import java.util.Arrays;

public class Find_second_largestn {
    public static int findSecondLargest(int[] arr){
    //   Arrays.sort(arr);
    //   for(int i=arr.length-1;i>0;i--){
    //     if(arr[i] != arr[i-1]){
    //         return arr[i-1];
    //     }
    //   }
    //   return Integer.MIN_VALUE;
         int max,secmax;
           max=secmax=Integer.MIN_VALUE;
         for(int x:arr){
            if(x>max){
            secmax =max;
            max =x;
         }else{
            if(x>secmax && x!=max){
                secmax =x;
         }
        }
    }
        return secmax;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,43,54,13,54,6};
        int secondLargest = findSecondLargest(arr);
        System.out.println("Second largest number is: " + secondLargest);
    }
}
//Time complexity is O(n)