//409. Longest Palindrome

public class Solution {
    public static void main(String[] args) {
        String s = "aaAAsss";
        System.out.println(longestPalindrome(s));
    }

    public static int longestPalindrome(String s) {
        int[] array = new int[58];
        int counter = 0;
        int correction = 0;
        boolean hasOdd = false;
        for (int i = 0; i < s.length(); i++) {
            array[s.charAt(i) - 'A']++;
        }
        for (Integer num : array) {
            if (num > 1 && num % 2 != 0 && !hasOdd) {
                counter += num;
                hasOdd = true;
            } else if (num > 1 && num % 2 != 0 && hasOdd) {
                counter += num;
                correction++;
            } else if (num > 1 && num % 2 == 0) {
                counter += num;
            }
        }
        if (counter % 2 == 0 && counter < s.length()) {
            return counter + 1;
        }
        return counter - correction;
    }
}
