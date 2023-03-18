//1957. Delete Characters to Make Fancy String

public class Solution {
    public static void main(String[] args) {
        String s = "aaabaaaa";
        System.out.println(makeFancyString(s));
    }

    public static String makeFancyString(String s) {
        if (s.length() == 1 || s.length() == 2) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        sb.append(s.charAt(1));
        for (int i = 2; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1) && s.charAt(i) == s.charAt(i - 2)) {
                continue;
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
