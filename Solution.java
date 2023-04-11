//844. Backspace String Compare

public class Solution {
    public static void main(String[] args) {
        String s = "xywrrmp";
        String t = "xywrrmu#p";
        System.out.println(backspaceCompare(s, t));
    }

    public static boolean backspaceCompare(String s, String t) {
        int indexS = 0;
        int indexT = 0;
        StringBuilder sbS = new StringBuilder();
        StringBuilder sbT = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (indexS != 0) {
                    sbS.delete(indexS - 1, indexS);
                    indexS--;
                }
            } else {
                sbS.append(s.charAt(i));
                indexS++;
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (indexT != 0) {
                    sbT.delete(indexT - 1, indexT);
                    indexT--;
                }
            } else {
                sbT.append(t.charAt(i));
                indexT++;
            }
        }
        return sbS.toString().contentEquals(sbT);
    }
}
