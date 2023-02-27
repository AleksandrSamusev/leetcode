//500. Keyboard Row

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(findWords(words)));
    }

    public static String[] findWords(String[] words) {

        ArrayList<String> result = new ArrayList<>();
        ArrayList<Character> top = new ArrayList<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
        ArrayList<Character> middle = new ArrayList<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
        ArrayList<Character> bottom = new ArrayList<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));

        for (int i = 0; i < words.length; i++) {
            boolean flag = true;
            String s = words[i].toLowerCase();
            char temp = s.charAt(0);
            if (temp == 'q' || temp == 'w' || temp == 'e' || temp == 'r' || temp == 't' || temp == 'y'
                    || temp == 'u' || temp == 'i' || temp == 'o' || temp == 'p') {

                for (int k = 1; k < s.length(); k++) {
                    if (!top.contains(s.charAt(k))) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    result.add(words[i]);
                }
            } else if (temp == 'a' || temp == 's' || temp == 'd' || temp == 'f' || temp == 'g' || temp == 'h'
                    || temp == 'j' || temp == 'k' || temp == 'l') {

                for (int k = 1; k < s.length(); k++) {
                    if (!middle.contains(s.charAt(k))) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    result.add(words[i]);
                }
            } else if (temp == 'z' || temp == 'x' || temp == 'c' || temp == 'v' || temp == 'b' || temp == 'n'
                    || temp == 'm') {

                for (int k = 1; k < s.length(); k++) {
                    if (!bottom.contains(s.charAt(k))) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    result.add(words[i]);
                }
            }
        }
        return result.toArray(new String[0]);
    }
}
