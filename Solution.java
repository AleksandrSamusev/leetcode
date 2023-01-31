//242_valid_anagram

public class Solution {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        sb1.append(s);
        sb2.append(t);

        for (int i = 0; i < sb1.length(); i++) {
            for (int j = 0; j < sb2.length(); j++) {
                if (sb2.charAt(j) == sb1.charAt(i)) {
                    sb2.deleteCharAt(j);
                    break;
                }
            }
        }
        if (sb2.length() == 0) {
            return true;
        }
        return false;
    }
}

