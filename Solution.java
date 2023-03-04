//1351. Count Negative Numbers in a Sorted Matrix

public class Solution {
    public static void main(String[] args) {
        int[][]  grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{0,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }

    public static int countNegatives(int[][] grid) {
        int sumNegative = 0;
        for(int[] array: grid) {
            sumNegative += qtyOfNegatives(array);
        }
        return sumNegative;
    }

    public static int qtyOfNegatives(int[] array) {
        int left = 0;
        int right = array.length-1;
        int mid;

        if(array[0] < 0) {
            return array.length;
        }

        if(array[array.length-1] >= 0) {
            return 0;
        }


        int iteration = 0;
        while(left<=right) {
            iteration++;
            System.out.println("Iteration: " + iteration);
            if(array[right] < 0 && array[right-1] >=0) {
                System.out.println("*****************************");
                return array.length - right;
            }
            mid = (left + right)/2;
            if(array[mid] < 0 && array[mid-1] >=0) {
                System.out.println(array.length - mid);
                System.out.println("*****************************");
                return array.length - mid;
            }
            if(array[mid] >=0) {
                left = mid+1;
            }
            if(array[mid] < 0) {
                right = mid-1;
            }
        }
        return 0;
    }
}
