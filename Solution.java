//1528_shuffle_string
public class Solution {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 2, 1, 3};
        String s = "codeleet";
        System.out.println(restoreString(s, nums));
    }

    public static String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        for (int i = 0; i < indices.length; i++) {
            sb.setCharAt(indices[i], s.charAt(i));
        }
        return sb.toString();
    }
}
