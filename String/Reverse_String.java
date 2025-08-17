
public class Reverse_String {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
        // for (int i = str.length() - 1; i >= 0; i--){
        //     sb.append(str.charAt(i));
        // }
        // System.out.println(sb.toString());
        // System.out.println(sb.getClass().getName());
         
        // String result = sb.toString();
        // System.out.println(result);
        // System.out.println(result.getClass().getName());
        String ans = " ";
        for (int index = 0; index <str.length(); index++) {
            ans = str.charAt(index) +ans;
        }
        System.out.println(ans);
        Reverse_String2("Ranvijay");
        Reverse_String3("Ranvijay");
        Reverse_Number(320);
    }
    private static void Reverse_String2(String input){
        StringBuilder sb = new StringBuilder(input);
        //solve the using formula n/2 
        int n = sb.length();
        for(int i=0;i<n;i++){
            char firstchar = input.charAt(i);
            char lastchart = input.charAt(n-1-i);

            sb.setCharAt(i, lastchart);
            sb.setCharAt(n-1-i, firstchar);
        }
        System.out.println(sb);
    }
    private static void Reverse_String3(String input){
        int n =input.length();
        StringBuilder sb =new StringBuilder();
        for(int i =n-1;i>=0;i--){
            sb.append(input.charAt(i));
        }
        System.out.println(sb.toString());
    }

    static void Reverse_Number(int n){
        boolean isnegative = n <0;
        n = Math.abs(n);
        int Reverse_Number =0;
        while(n!=0) {
            int digit = n %10;
            Reverse_Number = Reverse_Number *10 +digit;
            n /=10;
        }
        if(isnegative){
            System.out.println(-Reverse_Number);
        }else{
            System.out.println(Reverse_Number);
        }
    }
          
        public static String reverse(int number) {
            String numberStr = String.valueOf(number);
            StringBuilder reversed = new StringBuilder(numberStr).reverse();
            return reversed.toString();
        }
    
}
