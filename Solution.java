//1071. Greatest Common Divisor of Strings

public class Solution {
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";

        System.out.println(gcdOfStrings(str1, str2));
    }

    public static String gcdOfStrings(String str1, String str2) {
        String newStr = "";
        if (!str1.contains(str2) && !str2.contains(str1)) {
            return newStr;
        }
        if (str1.length() > str2.length()) {
            if (str1.contains(str2) && (str1.replace(str2, "").equals("") || str1.replace(str2, "").equals(str2))) {
                newStr = str1.replaceFirst(str2, "");
            }
        } else {
            if (str2.contains(str1)) {
                newStr = str2.replaceFirst(str1, "");
            }
        }
        return newStr;
    }
}
