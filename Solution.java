//8. String to Integer (atoi)

public class Solution {
    public static void main(String[] args) {
        String s = "42";
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s) {
        char ch = 0;
        int counter = 0;
        String result;
        double res = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                counter++;
            } else if (s.charAt(i) == '-') {
                ch = '-';
                counter++;
                break;
            } else if (s.charAt(i) == '+') {
                ch = '+';
                counter++;
                break;
            } else if (Character.isDigit(s.charAt(i))) {
                break;
            }
        }
        for (int i = counter; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                while (Character.isDigit(s.charAt(i))) {
                    sb.append(s.charAt(i));
                    if (i < s.length() - 1) {
                        i++;
                    } else {
                        break;
                    }
                }
                break;
            } else {
                return 0;
            }
        }

        if (sb.length() == 0) {
            return 0;
        }
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 0) {
                sb.deleteCharAt(i);
                i--;
            } else {
                break;
            }
        }
        if (ch != 0) {
            result = ch + sb.toString();
        } else {
            result = sb.toString();
        }
        res = Double.parseDouble(result);
        if (res > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (res < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) res;
    }
}
