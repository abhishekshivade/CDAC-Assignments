// Write a Java program to find the most frequent element in an array?

import java.util.HashMap;
import java.util.Map;

public class Que15 {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 5, 7, 8, 2, 6, 7, 4, 5 };
        int maxCount = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            if (map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else
                map.put(i, 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();

            if (maxCount < count) maxCount = count;
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxCount) {
                int num = entry.getKey();
                int count = entry.getValue();

                System.out.println(num + " occurred " + count + " times");
            }
        }
    }
}
