import java.util.Arrays;

public class Sort_String {
    public static void main(String[] args) {
        //Sort String Characters In Alphabetical Order

        //tocharArray() method
// The toCharArray() method in Java is used to convert a String into an array of characters (char[]). This method is a part of the String class.

        String str ="java";

        //Apporach -1
        char [] charArr =str.toCharArray();

        for(int i=0;i<=charArr.length;i++){
            for (int j = i+1; j < charArr.length; j++) {
                if (charArr[i]>charArr[j]) {
                    char temp = charArr[i];
                    charArr[i] = charArr[j];
                    charArr[j] = temp;
                }
            }
            System.out.println();
        }
        System.out.println(new String(charArr));


        //Apporach -2 

        String st ="ranvijay";
        char [] charArr1 =st.toCharArray();
        Arrays.sort(charArr1);
        System.out.println(new String(charArr1));
    }
}
