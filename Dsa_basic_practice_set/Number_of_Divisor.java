
public class Number_of_Divisor {
    public static void main(String[] args) {
        divisor(3);
    }
    public static void divisor(int n){
        int count = 0;
        for(int i=1;i*i<=n;i++){
            if (n%i ==0) {
                count++;
                if (i !=n /i) {
                    count++;
                }
                
            }
        }
        System.out.println(n+" The number of divisor is : "+count);
    }
}

