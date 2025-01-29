public class Practice_java {
    public static void main(String[] args) {
        String word = "Hello Mohan";

        // Apporach -2

        char[] charArr = word.toCharArray();
        for (int i = charArr.length - 1; i >= 0; i--) {
            System.out.print(charArr[i]);
        }

        System.out.println();

        // Apporach -2
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }

        // Apporach -3
        System.err.println();
        StringBuffer sb = new StringBuffer(word);
        System.out.print(sb.reverse());

        // Apporach -4
        System.out.println();
        StringBuilder st = new StringBuilder(word);
        System.out.print(st.reverse());
    }
}
