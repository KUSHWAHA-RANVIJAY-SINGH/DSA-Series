//Write a Code to check whether one string is a rotation of another string or not.
public class Question_5 {
    static boolean areRotations(String s1,String s2){
        s1 = s1+s1;
        if(s1.contains(s2)){
            return true;
        }
                return s1.contains(s2);
    }
    public static void main(String[] args) {
        String s1 ="aab";
        String s2 = "aba";

        System.out.println(areRotations(s1,s2));
    }
}
