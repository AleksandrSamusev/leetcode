//504. Base 7

public class Solution {
    public static void main(String[] args) {
        int num = -8;
        System.out.println(convertToBase7(num));
    }

    public static String convertToBase7(int num) {
        boolean isNegative = false;
        if (num < 0) {
            isNegative = true;
        }
        if (num == 0) {
            return "0";
        }
        num = Math.abs(num);
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int remainder = num % 7;
            sb.insert(0, remainder);
            num = num / 7;
        }
        if (isNegative) {
            sb.insert(0, "-");
        }
        return sb.toString();
    }
}
