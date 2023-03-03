//28. Find the Index of the First Occurrence in a String

public class Solution {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }

        int counter = 0;
        int index = -1;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                index = i;
                int tempH = i;
                int tempN = 0;
                while (haystack.charAt(tempH) == needle.charAt(tempN)) {
                    counter++;
                    tempH++;
                    tempN++;
                    if (tempN == needle.length()) {
                        break;
                    }
                    if (tempH == haystack.length()) {
                        break;
                    }

                }
                if (counter != needle.length()) {
                    index = -1;
                    counter = 0;
                } else {
                    return index;
                }
            }
        }
        return index;

    }
}
