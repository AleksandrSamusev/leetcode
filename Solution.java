//1694. Reformat Phone Number

public class Solution {
    public static void main(String[] args) {
        String number = "123 4-5678";
        System.out.println(reformatNumber(number));
    }

    public static String reformatNumber(String number) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) != ' ' && number.charAt(i) != '-') {
                sb.append(number.charAt(i));
            }
        }
        String reformatted = sb.toString();
        int index = 0;
        if (reformatted.length() <= 3) {
            return reformatted;
        } else if (reformatted.length() == 4) {
            return reformatted.substring(0, 2) + "-" + reformatted.substring(2);
        }
        while ((reformatted.length() - index) > 4) {
            sb2.append(reformatted.charAt(index))
                    .append(reformatted.charAt(index + 1))
                    .append(reformatted.charAt(index + 2))
                    .append("-");
            index += 3;
        }
        if (reformatted.length() - index <= 3) {
            sb2.append(reformatted.substring(index));
            return sb2.toString();
        } else if (reformatted.length() - index == 4) {
            sb2.append(reformatted, index, index + 2).append("-")
                    .append(reformatted.substring(index + 2));
            return sb2.toString();
        }
        return null;
    }
}
