//744. Find the Smallest Letter Greater Than Target

public class Solution {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(letters, target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        for (Character ch : letters) {
            if (ch > target) {
                return ch;
            }
        }
        return letters[0];
    }
}
