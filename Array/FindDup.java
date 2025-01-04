import java.util.Arrays;

public class FindDup {
    public static void findduplict(int []arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] ==arr[j]) {
                    System.out.println(arr[j]);
                    break;
                }
            }
        }
    }

    public static int finddup(int[] arr){
        int dup=-1;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i+1]) {
                dup=arr[i];
                break;
            }
        }
        return dup;
    }

    public static void finddup2(int arr[]){
        for (int i = 0; i < arr.length; i++) {
        int x= Math.abs(arr[i]);
        if (arr[x]>0) {
            arr[x]=-arr[x];
        }else{
            System.out.println(x);
        }
        }
    }

    
        public static void finddup3(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                int x = arr[i] % arr.length;
                arr[x] += arr.length;
            }
            boolean found =false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] / arr.length >= 2) {
                    System.out.println(i);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No repeating elements");
            }
        }
    public static void main(String[] args) {
        int[] arr = {2, 3, 1,0,2};
       
        System.out.println(Arrays.toString(arr));
        // FindDup.findduplict(arr);
        // System.out.println(FindDup.finddup(arr));
        FindDup.finddup3(arr);
    }
}
