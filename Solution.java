public class Solution {
    public static void main(String[] args) {
        int[] salary = {7, 7, 6, 10, 6, 5, 5, 8, 8, 9, 9, 11, 11};
        System.out.println(average(salary));
    }

    public static double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        int sum = 0;

        for (int i = 0; i < salary.length; i++) {
            if (salary[i] >= max) {
                max = salary[i];
            }
            if (salary[i] < min) {
                min = salary[i];
            }
            sum += salary[i];
        }
        return (double) (sum - max - min) / (double) (salary.length - 2);
    }
}
