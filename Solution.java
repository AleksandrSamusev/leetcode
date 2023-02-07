//387. First Unique Character in a String

public class Solution {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        int result = 0;
        char ch = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ch) {
                ch = s.charAt(i);
                result = i;
            } else {
                result = -1;
            }
        }
        return result;
    }
}
