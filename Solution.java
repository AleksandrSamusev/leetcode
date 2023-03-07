//1154. Day of the Year

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Solution {
    public static void main(String[] args) {
        String date = "2019-09-20";
        System.out.println(dayOfYear(date));
    }

    public static int dayOfYear(String date) {
        Calendar cal = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            cal.setTime(sdf.parse(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return cal.get(Calendar.DAY_OF_YEAR);
    }
}
