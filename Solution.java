//1346. Check If N and Its Double Exist

public class Solution {
    public static void main(String[] args) {
        int[] arr = {-2, 0, 10, -19, 4, 6, -8};
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        int[] arrayOfNegative = new int[1001];
        int[] arrayOfPositive = new int[1001];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                arrayOfPositive[arr[i]]++;
            } else if (arr[i] < 0) {
                arrayOfNegative[Math.abs(arr[i])]++;
            }
        }
        for (int i = 1; i <= 500; i++) {
            if (arrayOfNegative[i] > 0) {
                if (i % 2 != 0) {
                    if (arrayOfNegative[i * 2] > 0) {
                        return true;
                    }
                } else {
                    if (arrayOfNegative[i / 2] > 0 || arrayOfNegative[i * 2] > 0) {
                        return true;
                    }
                }
            }
        }

        for (int i = 0; i <= 500; i++) {
            if (i == 0 && arrayOfPositive[i] >= 2) {
                return true;
            }
            if (arrayOfPositive[i] > 0 && i != 0) {
                if (i % 2 != 0) {
                    if (arrayOfPositive[i * 2] > 0) {
                        return true;
                    }
                } else {
                    if (arrayOfPositive[i / 2] > 0 || arrayOfPositive[i * 2] > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
