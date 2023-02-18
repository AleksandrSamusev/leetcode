//151. Reverse Words in a String

public class Solution {
    public static void main(String[] args) {
        String s = "   the   sky is blue     ";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] strArr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = strArr.length - 1; i >= 0; i--) {
            sb.append(strArr[i]);
            sb.append(" ");
        }
        return sb.substring(0, sb.length() - 1);
    }
}
