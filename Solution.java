//748. Shortest Completing Word

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        String licensePlate = "1s3 PSt";
        String[] words = {"step", "steps", "stripe", "stepple"};
        System.out.println(shortestCompletingWord(licensePlate, words));
    }

    public static String shortestCompletingWord(String licensePlate, String[] words) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < licensePlate.length(); i++) {
            if (Character.isLetter(licensePlate.charAt(i))) {
                sb.append(String.valueOf(licensePlate.charAt(i)).toLowerCase());
            }
        }
        for (String str : words) {
            if (isContain(sb, str)) {
                list.add(str);
            }
        }
        String result = "";
        int length = Integer.MAX_VALUE;
        for (String str : list) {
            if (str.length() < length) {
                length = str.length();
                result = str;
            }
        }
        return result;
    }

    public static boolean isContain(StringBuilder sb, String check) {
        StringBuilder local = new StringBuilder(sb);
        for (int i = 0; i < check.length(); i++) {
            for (int j = 0; j < local.length(); j++) {
                if (check.charAt(i) == (local.charAt(j))) {
                    local.deleteCharAt(j);
                    if (local.length() == 0) {
                        return true;
                    }
                    break;
                }
            }
        }
        return false;
    }
}
