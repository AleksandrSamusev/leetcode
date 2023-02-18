//824. Goat Latin

public class Solution {
    public static void main(String[] args) {
        String sentence = "yDumm";
        System.out.println(toGoatLatin(sentence));
    }

    public static String toGoatLatin(String sentence) {
        String[] str = sentence.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            String temp = str[i];
            char ch = temp.charAt(0);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                    || ch == 'u' || ch == 'U') {
                sb.append(changeIfVowel(temp, i));
            } else {
                sb.append(changeIfConsonant(temp, i));
            }
        }
        return sb.toString().trim();

    }

    private static String changeIfConsonant(String s, int index) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.substring(1));
        sb.append(s.charAt(0));
        sb.append("ma");
        addA(sb, index);
        return sb.toString();
    }

    private static String changeIfVowel(String s, int index) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("ma");
        addA(sb, index);
        return sb.toString();
    }

    private static String addA(StringBuilder sb, int index) {
        for (int i = 0; i <= index; i++) {
            sb.append("a");
        }
        sb.append(" ");
        return sb.toString();
    }


}
