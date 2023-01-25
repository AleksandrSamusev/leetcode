//168_excel_sheet_column_number
public class Solution {
    public static void main(String[] args) {
        System.out.println(convertToTitle(1000));
    }
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        int num = columnNumber - 1;
        while (num >= 0) {
            sb.append((char) ((num % 26) + 65));
            num = (num / 26) - 1;
        }
        return sb.reverse().toString();
    }
}
