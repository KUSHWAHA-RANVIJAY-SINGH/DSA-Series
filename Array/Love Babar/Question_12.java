//Maximum Subarray Sum – Kadane’s Algorithm
 public class Question_12 {

    static int MaximumSubarray(int arr[]){
        // int res = arr[0];
        // for(int i=0;i<arr.length;i++){
        //     int cursum =0;
        //     for(int j=i;j<arr.length;j++){
        //         cursum = cursum + arr[j];

        //         res = Math.max(cursum, res);
        //     }
        // }
        // return res;

        //Kedna's algorithm

        int maxsum = Integer.MIN_VALUE;
        int currentsum = 0;
        for (int i = 0; i <arr.length; i++) {
            currentsum = currentsum +arr[i];
            if (currentsum >maxsum) {
                maxsum = currentsum;
            }
            if (currentsum <0) {
                currentsum =0;
            }
        }
        return maxsum;
    }
 
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(MaximumSubarray(arr));
    }
 }