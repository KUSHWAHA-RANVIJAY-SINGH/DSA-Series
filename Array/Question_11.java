//Merge 2 sorted arrays without using Extra space.

import java.util.Arrays;

public class Question_11{
    //Naive Approach:
//It is the brute force method to do the same. Take all the elements of arr1 and arr2 in arr3. Then simply sort the arr3.
//Time Complexity : O((n1 + n2) log(n1 + n2)) , the whole size of arr3 is m+n
// Auxiliary Space: O(1)
    public static void mergeArrays(int[] arr1,int[] arr2,int[] arr3){
        int i=0 ,j=0,k=0;
        int n1 = arr1.length;
        int n2 = arr2.length;

        while (i<n1) {
            arr3[k++] = arr1[i++];
        }
        while (j<n2) {
            arr3[k++] = arr2[j++];
        }

        Arrays.sort(arr3);
    }
    //Efficient Approach:
    //Time Complexity : O(n1 + n2) 
// Auxiliary Space : O(n1 + n2)

public static void mergeArrays2(int[] arr1, int[] arr2, int[] arr3) {
    int i = 0, j = 0, k = 0;
    int n1 = arr1.length;
    int n2 = arr2.length;

    while (i < n1 && j < n2) {
      
        // Pick smaller of the two current elements and move ahead in the array of the picked element
        if (arr1[i] < arr2[j])
            arr3[k++] = arr1[i++];
        else
            arr3[k++] = arr2[j++];
    }

    // if there arre remaining elements of the first arrray, move them
    while (i < n1)
        arr3[k++] = arr1[i++];

    // Else if there arre remaining elements of the second arrray, move them
    while (j < n2)
        arr3[k++] = arr2[j++];
}

    public static void main(String[] arrgs) {
        int [] arr1 ={1,2,3,4,5};
        int [] arr2 = {10,9,8,7,6};
        int [] arr3 = new int[arr1.length+arr2.length];

        mergeArrays2(arr1, arr2, arr3);
        for (int i : arr3) {
            System.out.println(i);
        }
    }
}