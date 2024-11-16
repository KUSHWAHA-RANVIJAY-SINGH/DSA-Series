import java.util.Arrays;

public class Second_Largest_Element_in_Array {

    public static int findsecondlargest(int [] arr){
        // Arrays.sort(arr);
        // for(int i=arr.length-1;i>0;i--){
        //     if(arr[i]!=arr[i-1]){
        //         return arr[i-1];
        //     }
        // }   //One this code error maxmimum is same then code is failed 
        // return Integer.MAX_VALUE;

        int max,secmax ;
        max=secmax=Integer.MIN_VALUE;
       for(int num :arr){
            if (num >max) {
                secmax = max;
                max =num;
            }else if (num > secmax && num != max) {
                secmax =num;
            }
       }
       return secmax;
    }
    public static void main(String[] args) {
        // int [] arr ={1,3,5,34,4,2,54,2};
        int [] arr ={9,12,34,54,23,54};
        System.out.println(findsecondlargest(arr));
        
    }
}
