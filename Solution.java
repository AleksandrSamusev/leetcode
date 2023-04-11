//2390. Removing Stars From a String

public class Solution {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }

    public static String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        int sbIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                if (sbIndex != 0) {
                    sb.delete(sbIndex - 1, sbIndex);
                    sbIndex--;
                }
            } else {
                sb.append(s.charAt(i));
                sbIndex++;
            }
        }
        return sb.toString();
    }
}
