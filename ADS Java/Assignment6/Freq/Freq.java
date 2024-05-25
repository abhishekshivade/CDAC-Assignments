package Freq;

import java.util.*;

public class Freq {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 5, 7, 8, 2, 6, 7, 4, 5 };

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            if (map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else
                map.put(i, 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
                return e2.getValue().compareTo(e1.getValue());
            }
        });

        for (Map.Entry<Integer, Integer> entry : list) {
            int num = entry.getKey();
            int count = entry.getValue();

            System.out.println(num + " occurred " + count + " times");
        }
    }
}
