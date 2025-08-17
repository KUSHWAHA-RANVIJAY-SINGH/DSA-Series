import java.util.ArrayList;
import java.util.List;

public class Comon_element_two_sorted_array {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {1,3,4,6,8,9};
        // NaiveApporach(arr1, arr2);
        ProApporach(arr1, arr2);
        UsingArraylist(arr1, arr2);

    }
    static void NaiveApporach(int []arr1,int[] arr2){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if (arr1[i]==arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }

    static void ProApporach(int []arr1,int[] arr2){
        int i=0 ,j=0;
        while (i<arr1.length && j<arr2.length) {
            if (arr1[i]==arr2[j]) {
                System.out.println(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }else{
                i++;
            }
        }
    }

    static int[] UsingArraylist(int []nums1,int[] nums2){
         List<Integer> result = new ArrayList<>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                result.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else{
                i++;
            }
        }
        int [] resultArray = new int[result.size()];
        for(int k=0;k<result.size();k++){
            resultArray[k] = result.get(k);
        }
        return resultArray;
    }
}
