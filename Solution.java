//482. License Key Formatting

public class Solution {
    public static void main(String[] args) {
        String s = "--a-a-a-a--";               //k47r-0a42
        int k = 4;
        System.out.println(licenseKeyFormatting(s, k));
    }

    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (count < k) {
                if (s.charAt(i) != '-') {
                    sb.append(s.charAt(i));
                    count++;
                }
            } else {
                sb.append("-");
                count = 0;
                i++;
            }
        }
        sb.reverse();
        if (sb.length() > 0 && sb.charAt(0) == '-') {
            return sb.substring(1, sb.length()).toUpperCase();
        }
        return sb.toString().toUpperCase();
    }
}
