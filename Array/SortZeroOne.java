//Test case 1 : 0,1,1,0,1,0,1  Output: 0,0,0,1,1,1,1

import java.util.Arrays;

public class SortZeroOne {
    public static void sortOneandZero(int []arr){
        int left =0,right=arr.length-1;
        int temp;
        while(left<right){
            if (arr[left]==1) {
                if (arr[right] !=1) {
                    temp = arr[right];
                    arr[right] = arr[left];
                    arr[left] = temp;
                }
                right--;
            }
            else{
                left++;
            }
        }
    }
    public static void main(String[] args) {
        int []arr = {0,1,1,0,1,0,1};
        sortOneandZero(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
            // }
            System.out.println(Arrays.toString(arr));
        }
  
}
