//Find Duplicate characters in a string

import java.util.Arrays;
import java.util.HashSet;

public class Question_3 {
    public static void main(String[] args) {
        String str = "Ranvijayvn";
        HashSet<Character> seen = new HashSet<Character>();

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (seen.contains(c)) {
                System.out.println("Duplicate character: "+c);
            }
            else{
                seen.add(c);
            }

        

         
    }
     //Second Method to find duplicate characters
    char []  ch = str.toCharArray();
    Arrays.sort(ch);
    System.out.println(ch);
    for(int i=1;i< ch.length;i++){
        if(ch[i] ==ch[i-1]){
            System.out.println("Duplicate character:"+ch[i]);
        }
    }
    }
}
