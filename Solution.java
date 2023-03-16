//1935. Maximum Number of Words You Can Type

public class Solution {
    public static void main(String[] args) {
        String text = "hello world";
        String brokenLetters = "ad";
        System.out.println(canBeTypedWords(text, brokenLetters));
    }

    public static int canBeTypedWords(String text, String brokenLetters) {
        int[] alphabet = new int[27];
        for (int i = 0; i < brokenLetters.length(); i++) {
            alphabet[brokenLetters.charAt(i) - 'a']++;
        }
        String[] array = text.split(" ");
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int localCount = 0;
            for (int j = 0; j < array[i].length(); j++) {
                if (alphabet[array[i].charAt(j) - 'a'] == 0) {
                    localCount++;
                } else {
                    break;
                }
            }
            if (localCount == array[i].length()) {
                count++;
            }
        }
        return count;
    }
}
