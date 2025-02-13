
public class Square_root_of_an_integer {

    static int floorsqrt(int n){
        int res = (int)Math.exp(0.5* Math.log(n));

        if ((res +1) * (res +1) <=n) {
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 13;
        int result = (int) Math.sqrt(n);
        
        int res = 1;
        while (res * res <=n) {
            res++;
        }
        res--;
        System.out.println("Square root of " + n + " is " + res);
        System.out.println(floorsqrt(n));

    }
}
