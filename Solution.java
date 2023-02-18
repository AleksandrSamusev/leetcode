//1047. Remove All Adjacent Duplicates In String

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        String s = "abbbabaaa";
        System.out.println(removeDuplicates(s));
    }

    public static String removeDuplicates(String s) {
        ArrayList<Character> list = new ArrayList<>();
        list.add(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                if (list.size() == 0 || (list.size() > 0 && list.get(list.size() - 1) != s.charAt(i))) {
                    list.add(s.charAt(i));
                } else if (list.size() > 0 && list.get(list.size() - 1) == s.charAt(i)) {
                    list.remove(list.size() - 1);
                }
            } else {
                if (list.size() > 0 && list.get(list.size() - 1) == s.charAt(i)) {
                    list.remove(list.size() - 1);
                } else if (list.size() == 0 || (list.size() > 0 && list.get(list.size() - 1) != s.charAt(i))) {
                    list.add(s.charAt(i));
                }
            }
        }
        StringBuilder builder = new StringBuilder(list.size());
        for (Character ch : list) {
            builder.append(ch);
        }
        return builder.toString();
    }
}
