/*Write a Java program or function to find smallest and second smallest element in an integer array. For example, if {17, 11, 23, 64, 41, 88, 35} is an input array then smallest and second smallest elements are 11 and 17 respectively.*/

import java.util.Arrays;

public class Que21 {
    public static void main(String[] args) {
        int[] arr = { 17, 11, 23, 64, 41, 88, 35 };

        int s = arr[0], s1 = s;

        for (int i : arr) {
            if (i < s) {
                s1 = s;
                s = i;
            } else if (i > s && i < s1)
                s1 = i;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Smallest : "+s);
        System.out.println("2nd Smallest : "+s1);
    }
}
