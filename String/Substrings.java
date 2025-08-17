public class Substrings {
    public static void main(String[] args) {
        getALLsubstring("abc");
    }
    private static void getALLsubstring(String input){
        int n = input.length();
        for(int startidx=0;startidx<n;startidx++){
            for(int endidx=startidx;endidx<=n;endidx++){
                System.out.println(input.substring(startidx,endidx));
            }
        }
    }
}
