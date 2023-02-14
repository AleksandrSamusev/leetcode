//415. Add Strings

public class Solution {
    public static void main(String[] args) {
        String num1 = "222";
        String num2 = "333";
        System.out.println(addStrings(num1, num2));
    }

    public static String addStrings(String num1, String num2) {
        int scoop = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int sum = scoop;
            if (i >= 0) {
                sum += num1.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += num2.charAt(j--) - '0';
            }
            sb.append(sum % 10);
            scoop = sum / 10;
        }
        if (scoop != 0) {
            sb.append(scoop);
        }
        return sb.reverse().toString();
    }
}
