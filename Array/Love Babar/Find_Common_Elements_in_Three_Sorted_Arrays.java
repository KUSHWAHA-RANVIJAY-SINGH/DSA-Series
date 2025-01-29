
public class Find_Common_Elements_in_Three_Sorted_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 5,8, 10, 20, 40,100};
        int[] arr2 = {6, 7, 8, 80, 100};
        int[] arr3 = {8, 10, 15, 30, 70 ,100};

        // NaiveApporach(arr1,arr2,arr3);
        ProApporach(arr1,arr2,arr3);
        
    }
    private static void NaiveApporach(int arr1[],int arr2[],int arr3[]){
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

    private static void ProApporach(int arr1[],int arr2[],int arr3[]){
        int i = 0, j = 0, k = 0;

        while (i<arr1.length && j<arr2.length && k<arr3.length) {
            if (arr1[i]==arr2[j] && arr2[j]==arr3[k]) {
                System.out.println(arr1[i]);
                i++;
                j++;
                k++;
            }else if (arr1[i]>arr2[j]) {
                j++;
            }else if (arr2[j]>arr3[k]) {
                k++;
            }else{
                i++;
            }
        }
    }
}
