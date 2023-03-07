//1408. String Matching in an Array

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        String[] words = {"leetcode", "et", "code"};
        System.out.println(stringMatching(words));
    }

    public static List<String> stringMatching(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (!words[i].equals(words[j])) {
                    if (words[i].contains(words[j])) {
                        if (!list.contains(words[j])) {
                            list.add(words[j]);
                        }
                    }
                }
            }
        }
        return list;
    }
}
