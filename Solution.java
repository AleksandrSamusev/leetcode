//1185. Day of the Week

import java.time.LocalDate;


public class Solution {
    public static void main(String[] args) {
        int day = 18;
        int month = 7;
        int year = 1999;
        System.out.println(dayOfTheWeek(day, month, year));
    }

    public static String dayOfTheWeek(int day, int month, int year) {
        LocalDate myDate3 = LocalDate.of(year, month, day);
        String result = String.valueOf(myDate3.getDayOfWeek()).toLowerCase();
        return result.substring(0, 1).toUpperCase() + result.substring(1);
    }
}
