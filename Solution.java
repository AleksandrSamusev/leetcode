//1309. Decrypt String from Alphabet to Integer Mapping

public class Solution {
    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }

    public static String freqAlphabets(String s) {
        char[] letters = {'0', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        StringBuilder result = new StringBuilder();
        boolean flag = s.charAt(s.length() - 1) == '#';
        String[] str = s.split("#");
        if (str.length == 1 && flag) {
            return numbersToWord(str[0], letters);
        } else if (str.length == 1) {
            return numbersToWordNoFlag(str[0], letters);
        } else if (str.length > 1 && flag) {
            for (String value : str) {
                result.append(numbersToWord(value, letters));
            }
            return result.toString();
        } else if (str.length > 1) {
            for (int i = 0; i < str.length - 1; i++) {
                result.append(numbersToWord(str[i], letters));
            }
            result.append(numbersToWordNoFlag(str[str.length - 1], letters));
        }
        return result.toString();
    }

    public static String numbersToWord(String s, char[] letters) {
        StringBuilder sb = new StringBuilder();
        if (s.length() > 2) {
            int i = 0;
            while (i < s.length() - 2) {
                sb.append(letters[Integer.parseInt(String.valueOf(s.charAt(i)))]);
                i++;
            }
            sb.append(letters[Integer.parseInt(s.substring(s.length() - 2))]);
        } else {
            sb.append(letters[Integer.parseInt(s)]);
        }
        return sb.toString();
    }

    public static String numbersToWordNoFlag(String s, char[] letters) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(letters[Integer.parseInt(String.valueOf(s.charAt(i)))]);
        }
        return sb.toString();
    }
}
