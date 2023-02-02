//929. Unique Email Addresses

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        String[] emails = {"a@leetcode.com", "b@leetcode.com", "c@leetcode.com"};
        System.out.println(numUniqueEmails(emails));
    }

    public static int numUniqueEmails(String[] emails) {
        HashSet<String> local = new HashSet<>();
        for (String str : emails) {
            StringBuilder sb = new StringBuilder();
            String[] temp = str.split("@");

            for (int i = 0; i < temp[0].length(); i++) {
                if (!String.valueOf(temp[0].charAt(i)).equals(".")) {
                    sb.append(temp[0].charAt(i));
                }
            }
            if (temp[0].contains("+")) {
                sb.delete(sb.indexOf("+"), sb.length());
            }
            local.add(String.valueOf(sb.append("@").append(temp[1])));
        }
        return local.size();
    }
}
