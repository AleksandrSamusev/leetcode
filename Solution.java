//2243. Calculate Digit Sum of a String

public class Solution {
    public static void main(String[] args) {
        String s = "11111222223";
        int k = 3;
        System.out.println(digitSum(s, k));
    }

    public static String digitSum(String s, int k) {
        while (s.length() > k) {
            s = createNewString(s, k);
        }
        return s;
    }

    public static String createNewString(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
            temp++;
            if (temp == k || i == s.length() - 1) {
                sb.append(sum);
                sum = 0;
                temp = 0;
            }

        }
        return sb.toString();
    }
}
