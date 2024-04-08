// Write a Java program to find the intersection of two arrays?

import java.util.Arrays;

public class Que6 {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8, 10};
        int[] arr2 = {1, 3, 5, 7, 9, 4, 6};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0;
        int j = 0;
        int k = 0;

        int[] intersection = new int[Math.min(arr1.length, arr2.length)];

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                if (k == 0 || intersection[k - 1] != arr1[i]) {
                    intersection[k] = arr1[i];
                    k++;
                }
                i++;
                j++;
            }
        }

        intersection = Arrays.copyOf(intersection, k);

        System.out.println("Intersection of the two arrays:");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
