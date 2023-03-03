//796. Rotate String

public class Solution {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s, goal));
    }

    public static boolean rotateString(String s, String goal) {
        int iterations = s.length() - 1;
        if (s.equals(goal)) {
            return true;
        }
        for (int i = 0; i <= iterations; i++) {
            s = firstToEnd(s);
            if (s.equals(goal)) {
                return true;
            }
        }
        return false;
    }

    public static String firstToEnd(String str) {
        return str.substring(1) + str.charAt(0);
    }
}
