public class Maximum_SubArray {
    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int n = arr.length;
        Maximum_SubArray subArray = new Maximum_SubArray();
        int maxSum = subArray.maxSubArray(arr);
        System.out.println("Maximum SubArray Sum: " + maxSum);

       
    }
    //Brute Force Approach
    public  int maxSubArray(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for (int st = 0; st < n; st++) {
            int currentSum = 0;
            for(int end= st; end <n;end++ ){
                currentSum += arr[end];
                maxSum = Math.max(maxSum, currentSum);
            }
            
            
        }
        return maxSum;

    }
}
