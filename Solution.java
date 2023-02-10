//338. Counting Bits

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(countBits(n)));
    }
    public static int[] countBits(int n) {
        int[] resultArray = new int[n+1];
        for(int i = 0; i< resultArray.length; i++) {
            resultArray[i] = getSum(i);
        }
        return resultArray;
    }

    public static int getSum(int n) {
        String str = Integer.toBinaryString(n);
        int result = 0;
        for(int i = 0; i<str.length(); i++) {
            if(Integer.parseInt(String.valueOf(str.charAt(i))) == 1) {
                result++;
            }
        }
        return result;
    }
}
