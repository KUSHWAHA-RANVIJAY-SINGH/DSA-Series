// find duplicate in an array of N+1 Integers

import java.util.Arrays;
import java.util.*;

public class Question_10 {
    static int findduplicate(int [] arr){
        int n = arr.length;
        Arrays.sort(arr);
        for(int i = 0; i < n; i++){
            if (arr[i] ==arr[i+1]) {
                return arr[i];
            }
        }
        return -1;

        //time complexity of this algorithm is O(n2).
    }

   static int findduplicateoptimal(int arr[]){
        HashSet<Integer> seen = new HashSet<>();
        
        for (int i : arr) {
            if (seen.contains(i)) {
                return i;
            }
            seen.add(i);
        }
        return -1;
   }

   //contains duplicate;
   private static boolean containsDuplicate(int arr[]){
        HashSet<Integer> set =new HashSet<>();
        for(int i : arr){
            if (set.contains(i)) {
                return true;
            }
            set.add(i);
        }
        return false;
   }
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,2};
        System.out.println(containsDuplicate(arr));
        int duplicate=  findduplicateoptimal(arr);
        if (duplicate !=-1) {
            System.out.println("Duplicate found " + duplicate);
        }else{
            System.out.println("No duplicate found");
        }
    }
}
