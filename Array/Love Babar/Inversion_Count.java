public class Inversion_Count {
    public static int Inversion_Count_Brute_froce(int [] arr){
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr = {2, 4, 1, 3, 5};
        System.out.println("Inversion count:"+Inversion_Count_Brute_froce(arr));
    }
}
