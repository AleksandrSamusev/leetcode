//944. Delete Columns to Make Sorted

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        String[] strs = {"zyx", "wvu", "tsr"};
        System.out.println(minDeletionSize(strs));
    }

    public static int minDeletionSize(String[] strs) {
        int delCount = 0;
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            list.add(strs[i]);
        }
        for (int i = 0; i < strs[0].length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (String str : list) {
                sb.append(str.charAt(i));
            }
            for (int j = 1; j < sb.length(); j++) {
                if (sb.charAt(j) < sb.charAt(j - 1)) {
                    delCount++;
                    break;
                }
            }
        }
        return delCount;
    }
}
