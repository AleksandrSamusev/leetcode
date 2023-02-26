//1009. Complement of Base 10 Integer

public class Solution {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(bitwiseComplement(n));
    }

    public static int bitwiseComplement(int n) {
        StringBuilder sb = new StringBuilder();
        String s = Integer.toBinaryString(n);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                sb.append('0');
            } else {
                sb.append('1');
            }
        }
        return Integer.parseInt(sb.toString(), 2);

    }
}
