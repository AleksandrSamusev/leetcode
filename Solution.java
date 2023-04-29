//1436. Destination City

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        List<List<String>> paths = List.of(List.of("London", "New York"),
                List.of("New York", "Lima"),
                List.of("Lima", "Sao Paulo"));
        System.out.println(destCity(paths));
    }

    public static String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for (List<String> list : paths) {
            set.add(list.get(0));
        }
        for (List<String> list : paths) {
            if (!set.contains(list.get(1))) {
                return list.get(1);
            }
        }
        return null;
    }
}
