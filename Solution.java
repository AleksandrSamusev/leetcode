//2309. Greatest English Letter in Upper and Lower Case

public class Solution {
    public static void main(String[] args) {
        String s = "arRAzFif";
        System.out.println(greatestLetter(s));
    }

    public static String greatestLetter(String s) {
        int[] lowCaseArray = new int[27];
        int[] upperCaseArray = new int[27];

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                upperCaseArray[s.charAt(i) - 'A']++;
            } else {
                lowCaseArray[s.charAt(i) - 'a']++;
            }
        }
        for (int i = upperCaseArray.length - 1; i >= 0; i--) {
            if (upperCaseArray[i] > 0 && lowCaseArray[i] > 0) {
                return Character.toString(i + 'A');
            }
        }
        return "";
    }
}
