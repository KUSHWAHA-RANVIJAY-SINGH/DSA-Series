//Find the union and intersection of two sorted arrays |Q.6| [Easy]

public class Question_6 {
    static void punion(int a[],int b[],int n,int n){
        int i=0,j=0;
        while(i<n && j<n){
            if (a[i]<b[j]) {
                System.out.println(a[i++]+" ");
            }
            else if (a[i]>b[j]) {
                System.out.println(b[j++]+" ");
            }
            else {
                System.out.println(a[i++]+" ");
            }
        }
        while(i<m){
            System.out.println(a[i++]+" ");
        
        }
        while(j<n){
            System.out.println(b[j++]+" ");
        }
    }

    public static void main(String[] args) {
        int a[] ={1,3,4,5,7};
        int b[] ={2,3,5,6};
        int n= a.length;
        int n= b.length;
    
        punion(a,b,n,n);
    }
}
