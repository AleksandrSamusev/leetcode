//1189. Maximum Number of Balloons

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String text = "loonbalxballpoon";
        System.out.println(maxNumberOfBalloons(text));
    }

    public static int maxNumberOfBalloons(String text) {
        int[] array = new int[5];
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'b') {
                array[0]++;
            } else if (text.charAt(i) == 'a') {
                array[1]++;
            } else if (text.charAt(i) == 'l') {
                array[2]++;
            } else if (text.charAt(i) == 'o') {
                array[3]++;
            } else if (text.charAt(i) == 'n') {
                array[4]++;
            }
        }

        array[2] /= 2;
        array[3] /= 2;

        return Arrays.stream(array).min().getAsInt();
    }
}
