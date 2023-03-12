//1287. Element Appearing More Than 25% In Sorted Array

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 6, 6, 6, 6, 7, 10};
        System.out.println(findSpecialInteger(arr));
    }

    public static int findSpecialInteger(int[] arr) {
        int qty = arr.length / 4;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + qty]) {
                return arr[i];
            }
        }
        return 0;
    }
}
