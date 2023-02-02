//557. Reverse Words in a String III

public class Solution {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        String temp = sb.append(s).reverse().toString();
        String[] array = temp.split("\\s+");
        for (int i = array.length - 1; i >= 0; i--) {
            result.append(array[i]).append(" ");
        }
        return result.toString().trim();
    }
}
