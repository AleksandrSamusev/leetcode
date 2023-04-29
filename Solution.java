//1576. Replace All ?'s to Avoid Consecutive Repeating Characters

public class Solution {
    public static void main(String[] args) {
        String s = "a?";
        System.out.println(modifyString(s));
    }

    public static String modifyString(String s) {
        if (s.length() == 1) {
            if (s.charAt(0) == '?') {
                return "a";
            } else {
                return s;
            }
        }
        StringBuilder sb = new StringBuilder();
        char lastChar = 0;
        char ch1;
        char ch2;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '?') {
                if (i == 0) {
                    ch1 = ch2 = s.charAt(i + 1);
                } else if (i == s.length() - 1 && lastChar != 0) {
                    ch1 = ch2 = lastChar;
                } else if (i == s.length() - 1 && lastChar == 0) {
                    ch1 = ch2 = s.charAt(i - 1);
                } else if (s.charAt(i - 1) == '?') {
                    ch1 = lastChar;
                    ch2 = s.charAt(i + 1);
                } else {
                    ch1 = s.charAt(i - 1);
                    ch2 = s.charAt(i + 1);
                }
                lastChar = getChar(ch1, ch2);
                sb.append(lastChar);
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    private static char getChar(char ch1, char ch2) {
        for (int i = 97; i <= 122; i++) {
            char result = (char) i;
            if (result != ch1 && result != ch2) {
                return result;
            }
        }
        return 0;
    }

}
