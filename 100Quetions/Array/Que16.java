// Write a Java program to find the minimum absolute difference between any two elements of the given array?

import java.util.Arrays;

public class Que16 {
    public static void main(String[] args) {
        int[] arr = { 6, 9, 4, 1, 2 };

        Arrays.sort(arr);

        int min = Math.abs(arr[1] - arr[0]);

        for (int i = 2; i < arr.length; i++) {
            if (Math.abs(arr[i] - arr[i - 1]) < min)
                min = Math.abs(arr[i] - arr[i - 1]);
        }

        System.out.println(min);
    }
}
