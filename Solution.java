//942. DI String Match

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String s = "IDID";  // 0,4,1,3,2
        System.out.println(Arrays.toString(diStringMatch(s)));
    }

    public static int[] diStringMatch(String s) {
        int[] result = new int[s.length() + 1];
        int minInit = 0;
        int maxInit = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).equals("I")) {
                result[i] = minInit++;
            } else {
                result[i] = maxInit--;
            }
        }
        if (String.valueOf(s.charAt(s.length() - 1)).equals("I")) {
            result[result.length - 1] = minInit;
        } else if (String.valueOf(s.charAt(s.length() - 1)).equals("D")) {
            result[result.length - 1] = maxInit;
        }
        return result;
    }
}
