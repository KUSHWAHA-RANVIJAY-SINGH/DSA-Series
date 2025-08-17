public class Majority_Element {

    static int Majority_Element_Brute(int []arr){
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int count =0;
            for(int j=0;j<n;j++){
                if (arr[i]==arr[j]) {
                    count++;
                }
            }
            if (count > n/2) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 3, 5, 1};
        int[] arr2 = {3, 3, 4, 2, 4, 4, 2, 4};


        System.out.println("Majority Element:"+Majority_Element_Brute(arr2));
    }
}
