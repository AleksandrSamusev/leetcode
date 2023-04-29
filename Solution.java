//1556. Thousand Separator

public class Solution {
    public static void main(String[] args) {
        int n = 1234123412;
        System.out.println(thousandSeparator(n));
    }

    public static String thousandSeparator(int n) {
        String number = Integer.toString(n);
        int counter = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = number.length() - 1; i >= 0; i--) {
            if (counter == 3) {
                sb.append(".");
                counter = 0;
                sb.append(number.charAt(i));
                counter++;
            } else {
                sb.append(number.charAt(i));
                counter++;
            }
        }
        return sb.reverse().toString();
    }
}
