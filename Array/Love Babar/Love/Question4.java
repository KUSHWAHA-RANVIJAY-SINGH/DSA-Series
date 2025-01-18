
public class Question4 {
    public static void main(String[] args) {
        int [] arr ={0,1,0,1,2,0,2,1};

        int b0 = 0,b1=0,b2=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==0){
                b0++;
            }
            else if(arr[i]==1){
                b1++;
            }else{
                b2++;
            }
        }
        int k=0;
        for(int i=1;i<=b0;i++){
            arr[k++]=0;
        }
        for(int i=0;i<b1;i++){
            arr[k++]=1;
        }
        for(int i=0;i<b2;i++){
            arr[k++]=2;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] +" ");
        }
    }
}
