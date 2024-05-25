// Write a Java program to find union and intersection of multiple arrays?

import java.util.ArrayList;

public class Que14 {
    public static void main(String[] args) {
        int[] arr1 = { 5, 4, 6, 8, 2, 1 };
        int[] arr2 = { 6, 3, 7, 5, 2, 9 };

        ArrayList<Integer> union = new ArrayList<Integer>();
        ArrayList<Integer> inter = new ArrayList<Integer>();

        for (int i : arr1) {
            for (int j : arr2) {
                if (i != j) {
                    if (!union.contains(i) && !union.contains(j)) {
                        union.add(i);
                        union.add(j);
                    }
                }else if(!inter.contains(i)) inter.add(i);
            }
        }

        System.out.println(union);
        System.out.println(inter);
    }
}
