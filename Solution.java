//7. Reverse Integer

public class Solution {
    public static void main(String[] args) {
        int x = 1534236469;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        String temp = String.valueOf(x);
        StringBuilder sb = new StringBuilder();
        char ch = 0;
        long result;
        if (temp.charAt(0) == '-') {
            sb.append(temp.substring(1));
            ch = '-';
        } else {
            sb.append(temp);
        }
        sb.reverse();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '0') {
                sb.deleteCharAt(i);
                i--;
            } else {
                break;
            }
        }
        if (ch != 0) {
            result = Long.parseLong(ch + sb.toString());
        } else {
            result = Long.parseLong(sb.toString());
        }
        if ((result < Integer.MAX_VALUE && result > Integer.MIN_VALUE)) {
            return (int) result;
        }
        return 0;
    }
}
