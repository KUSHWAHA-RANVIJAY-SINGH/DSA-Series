public class SwapAlternate{
    public static void AlternateSwap(int [] arr){

        for(int i=0;i<=arr.length-1;i+=2){
            int temp =arr[i];
            arr[i] =arr[i+1];
            arr[i+1] = temp;
        }
    }
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2,5,6,9,8,12,87,9};
            System.out.println("Befor Swap");
            for(int x:arr){
                System.out.print(x+" ");
            }
            AlternateSwap(arr);
            System.err.println();
            System.out.println("After Swap");
            for(int x:arr){
                System.out.print(x+" ");
            }

        } catch (Exception e) {
            System.out.println("Index out of bounds beacuase the array of even values not the put the odd value in array: " + e.getMessage()); 
        }
       
    }
  }