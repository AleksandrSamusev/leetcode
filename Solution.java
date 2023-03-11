//1507. Reformat Date

public class Solution {
    public static void main(String[] args) {
        String date = "20th Oct 2052";
        System.out.println(reformatDate(date));
    }

    public static String reformatDate(String date) {
        String[] strArr = date.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(strArr[2]);
        sb.append("-");
        sb.append(LettersToNumbers(strArr[1]));
        sb.append("-");
        int i = 0;
        if (Character.isDigit(strArr[0].charAt(1))) {
            sb.append(strArr[0].charAt(0));
            sb.append(strArr[0].charAt(1));
        } else {
            sb.append("0");
            sb.append(strArr[0].charAt(0));
        }
        return sb.toString();
    }

    public static String LettersToNumbers(String s) {
        switch (s) {
            case "Jan":
                return "01";
            case "Feb":
                return "02";
            case "Mar":
                return "03";
            case "Apr":
                return "04";
            case "May":
                return "05";
            case "Jun":
                return "06";
            case "Jul":
                return "07";
            case "Aug":
                return "08";
            case "Sep":
                return "09";
            case "Oct":
                return "10";
            case "Nov":
                return "11";
            case "Dec":
                return "12";
        }
        return null;
    }
}
