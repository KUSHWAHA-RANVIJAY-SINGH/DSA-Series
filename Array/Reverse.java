public class Reverse {
    static void reverseArray(int[] arr){
        int n=arr.length;

        int [] temp =new int[n];
        for(int i=0;i<n;i++){
            temp[i]=arr[n-i-1];
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }

    static void swapping_elements(int [] arr){
        int n=arr.length;
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }

  static void twopointers(int[] arr){
    int left=0,right=arr.length-1;

    while (left<right) {
        int temp =arr[left];
        arr[left] =arr[right];
        arr[right] = temp;

        left++;
        right--;
    }
  }

  public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7};
        // reverseArray(arr);
        // swapping_elements(arr);
        twopointers(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
