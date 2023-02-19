//541. Reverse String II


public class Solution {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 3;
        System.out.println(reverseStr(s, k));
    }

    public static String reverseStr(String s, int k) {
        int counter = 0;
        StringBuilder sb = new StringBuilder(s);
        StringBuilder result = new StringBuilder();
        if (s.length() == 1) {
            return s;
        }
        if (s.length() - counter < k) {
            result.append(sb).reverse();
            return result.toString();
        }
        while (s.length() - counter > 2 * k) {
            for (int i = k - 1; i >= 0; i--) {
                result.append(sb.charAt(i));
            }
            for (int j = k; j < 2 * k; j++) {
                result.append(sb.charAt(j));
            }
            sb.delete(0, 2 * k);
            counter += 2 * k;
        }
        if (s.length() - counter < k) {
            String temp = String.valueOf(sb.reverse());
            result.append(temp);
        } else if (s.length() - counter <= 2 * k) {
            for (int i = k - 1; i >= 0; i--) {
                result.append(sb.charAt(i));
            }
            for (int j = k; j < sb.length(); j++) {
                result.append(sb.charAt(j));
            }
        }
        return result.toString();
    }
}
