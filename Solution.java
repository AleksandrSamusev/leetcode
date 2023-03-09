//1360. Number of Days Between Two Dates

public class Solution {
    public static void main(String[] args) {
        String date1 = "2020-01-15";
        String date2 = "2019-12-31";
        System.out.println(daysBetweenDates(date1, date2));
    }

    public static int daysBetweenDates(String date1, String date2) {
        String[] date1Splitted = date1.split("-");
        String[] date2Splitted = date2.split("-");
        int days1 = daysFromTheBeginningOfTheYear(date1Splitted);
        int days2 = daysFromTheBeginningOfTheYear(date2Splitted);


        long start = System.nanoTime();
        for (int i = 1971; i < Integer.parseInt(date1Splitted[0]); i++) {
            if (isLeapYear(i)) {
                days1 += 366;
            } else {
                days1 += 365;
            }
        }

        for (int i = 1971; i < Integer.parseInt(date2Splitted[0]); i++) {
            if (isLeapYear(i)) {
                days2 += 366;
            } else {
                days2 += 365;
            }
        }
        long end = System.nanoTime();
        System.out.println(end - start);
        return Math.abs(days1 - days2);
    }

    public static int daysFromTheBeginningOfTheYear(String[] year) {
        int sum = 0;
        switch (year[1]) {
            case "02":
                sum += 31;
                break;

            case "03":
                sum += 59;
                break;

            case "04":
                sum += 90;
                break;

            case "05":
                sum += 120;
                break;

            case "06":
                sum += 151;
                break;

            case "07":
                sum += 181;
                break;

            case "08":
                sum += 212;
                break;

            case "09":
                sum += 243;
                break;

            case "10":
                sum += 273;
                break;

            case "11":
                sum += 304;
                break;

            case "12":
                sum += 334;
                break;
        }
        sum += Integer.parseInt(year[2]);
        if (isLeapYear(Integer.parseInt(year[0])) && Integer.parseInt(year[1]) > 2) {
            sum++;
        }
        return sum;
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
