
public class Find_Common_Elements_in_Three_Sorted_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 5,8, 10, 20, 40,100};
        int[] arr2 = {6, 7, 8, 80, 100};
        int[] arr3 = {8, 10, 15, 30, 70 ,100};

        for(int i=0;i<arr1.length;i++){
            for (int index = 0; index < arr2.length; index++) {
                for (int j = 0; j < arr3.length; j++) {
                    if (arr1[i] ==arr2[index] && arr2[index] == arr3[j]) {
                        System.out.println(arr1[i]);
                    }
                }
            }
        }
    }
}
