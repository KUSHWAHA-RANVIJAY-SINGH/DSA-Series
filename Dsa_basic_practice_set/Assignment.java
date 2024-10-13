
//You have beeb an array of size N.you need to swap every pair of alternate elements in the arrat list.
//test case : input 9,3,6,12,4,32
//output : 3,9,12,6,32,4
public class Assignment {
    public static void swapalternate(int[] arr){
        for(int i=0;i<arr.length;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]= {9,3,6,12,4,32};
        System.out.println("Before swaping this number:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("After swaping this number:");
        swapalternate(arr);
        for (int i : arr) {
         System.out.print(i +" ");
        }
    }
    
}
