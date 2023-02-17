//599. Minimum Index Sum of Two Lists

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String[] list1 = {"happy", "sad", "good"};
        String[] list2 = {"sad", "happy", "good"};
        System.out.println(Arrays.toString(findRestaurant(list1, list2)));
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        int distance = Integer.MAX_VALUE;
        ArrayList<String> l1 = new ArrayList<>(Arrays.asList(list1));
        ArrayList<String> l2 = new ArrayList<>(Arrays.asList(list2));
        ArrayList<String> l3 = new ArrayList<>(l2);
        ArrayList<String> result = new ArrayList<>();
        l3.retainAll(l1);
        for (String s : l3) {
            int temp = l2.indexOf(s) + l1.indexOf(s);
            if (temp < distance) {
                result.clear();
                distance = temp;
                result.add(s);
            } else if (temp == distance) {
                result.add(s);
            }
        }
        return result.toArray(new String[0]);
    }
}
