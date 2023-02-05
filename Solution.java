//804. Unique Morse Code Words

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};  //a-z , 97-122
        System.out.println(uniqueMorseRepresentations(words));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
                ".--", "-..-", "-.--", "--.."};

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (!list.contains(wordToMorse(morse, words[i]))) {
                list.add(wordToMorse(morse, words[i]));
            }
        }
        return list.size();
    }

    private static String wordToMorse(String[] morse, String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            sb.append(morse[word.charAt(i) - 97]);
        }
        return sb.toString();
    }
}
