//383. Ransom Note

public class Solution {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "ab";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] array = ransomNote.toCharArray();
        for (char ch : array) {
            if (magazine.contains(String.valueOf(ch))) {
                magazine = magazine.replaceFirst(String.valueOf(ch), "");
            } else {
                return false;
            }
        }
        return true;
    }
}
