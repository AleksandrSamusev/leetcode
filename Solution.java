//168_excel_sheet_column_number
public class Solution {
    public static void main(String[] args) {

        System.out.println(convertToTitle(100));
    }

    public static String convertToTitle(int columnNumber) {
        final StringBuilder sb = new StringBuilder();

        int num = columnNumber - 1;
        while (num >= 0) {
            int numChar = (num % 26) + 65;
            System.out.println(num % 26);
            sb.append((char) numChar);
            num = (num / 26) - 1;
        }
        return sb.reverse().toString();
    }
}
