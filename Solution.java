//884. Uncommon Words from Two Sentences

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String s1 = "apple apple";
        String s2 = "banana";
        System.out.println(Arrays.toString(uncommonFromSentences(s1, s2)));
    }

    public static String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String> listOne = new ArrayList<>();
        ArrayList<String> listTwo = new ArrayList<>();
        String[] arrOne = s1.split(" ");
        String[] arrTwo = s2.split(" ");

        ArrayList<String> doubles = new ArrayList<>();
        for (int i = 0; i < arrOne.length; i++) {
            if (!listOne.contains(arrOne[i])) {
                listOne.add(arrOne[i]);
            } else {
                if (!doubles.contains(arrOne[i])) {
                    doubles.add(arrOne[i]);
                }
            }
        }
        for (int i = 0; i < arrTwo.length; i++) {
            if (!listTwo.contains(arrTwo[i])) {
                listTwo.add(arrTwo[i]);
            } else {
                if (!doubles.contains(arrTwo[i])) {
                    doubles.add(arrTwo[i]);
                }
            }
        }

        listOne.removeAll(doubles);
        listTwo.removeAll(doubles);

        ArrayList<String> listTemp = new ArrayList<>(listOne);
        listOne.removeAll(listTwo);
        listTwo.removeAll(listTemp);
        listOne.addAll(listTwo);
        return listOne.toArray(new String[0]);
    }
}
