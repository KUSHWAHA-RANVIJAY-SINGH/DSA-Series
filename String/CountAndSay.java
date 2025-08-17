public class CountAndSay {
    static String lookandsay(int n) {
        // your code here
        if (n <= 0)
            return "";
        String result = "1";

        for (int i = 1; i < n; i++) {
            result = getNextSequence(result);
        }
        return result;
    }

    private static String getNextSequence(String s) {
        StringBuilder nextseq = new StringBuilder();
        int count = 1;
        char currenctChar = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == currenctChar) {
                count++;
            } else {
                nextseq.append(count).append(currenctChar);
                currenctChar = s.charAt(i);
                count = 1;
            }
        }
        nextseq.append(count).append(currenctChar);
        return nextseq.toString();
    }
    public static void main(String[] args) {
        System.out.println(lookandsay(5));
    }

}
