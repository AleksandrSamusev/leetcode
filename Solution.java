//290. Word Pattern

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";
        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if (str.length != pattern.length()) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i)) && !map.get(pattern.charAt(i)).equals(str[i])) {
                return false;
            } else if (!map.containsKey(pattern.charAt(i)) && map.containsValue(str[i])) {
                return false;
            }
            map.put(pattern.charAt(i), str[i]);
        }
        return true;
    }
}
