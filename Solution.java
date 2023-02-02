//709. To Lower Case

public class Solution {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(toLowerCase(s));
    }

    public static String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        return (sb.append(s.toLowerCase())).toString();
    }
}
