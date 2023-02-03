//917. Reverse Only Letters

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        String s = "Czyr^";
        System.out.println(reverseOnlyLetters(s));
    }

    public static String reverseOnlyLetters(String s) {
        ArrayList<String> list = new ArrayList<>();
        String[] array = new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (((int) s.charAt(i) <= 122 && s.charAt(i) >= 97)
                    || ((int) s.charAt(i) <= 90 && (int) s.charAt(i) >= 65)) {
                list.add(String.valueOf(s.charAt(i)));
            } else {
                array[i] = String.valueOf(s.charAt(i));
            }
        }
        int temp = 0;
        for (int j = array.length - 1; j >= 0; j--) {
            if (array[j] == null) {
                array[j] = list.get(temp);
                temp++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
        }
        return sb.toString();
    }
}
