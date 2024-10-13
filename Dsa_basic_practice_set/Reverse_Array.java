import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the number of how many reverse order print the data");
        // int n=sc.nextInt();
        // int[] arr=new int[n];
        // for(int i=0;i<n;i++)
        // {
        //     System.out.println("Enter the value of array"+arr[i]);
        //     arr[i]=sc.nextInt();
        // }
        // System.err.println("Reverser Array");
        // for(int i=n-1;i>=0;i--)
        // {
        //     System.out.print(+arr[i]+ " ");
        // }
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of how many reverse order print the data");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the value of array ");

        for (int i = 0; i < size-1; i++) {
            a[i]=sc.nextInt();
        }
        

        System.out.println("Reverse Array:");
        for(int i=size-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        
    }

}
