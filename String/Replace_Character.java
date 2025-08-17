//Replace Character With It's Occurrence 
public class Replace_Character {
    public static void main(String[] args) {
        String inputString = "Ranvijay";
        char charReplace = 'a';

        if (inputString.indexOf(charReplace) == -1) {
            System.out.println("Given String is not avilable in the string.0");
            System.exit(0);
        }
        int cnt =1;
        for (int i = 0; i < inputString.length(); i++) {
            
            char ch = inputString.charAt(i);
            if (ch == charReplace) {
               inputString =  inputString.replaceFirst(String.valueOf(charReplace),String.valueOf(cnt));
               cnt++;
            }
         
        }
        System.out.println(inputString);
    }
}
