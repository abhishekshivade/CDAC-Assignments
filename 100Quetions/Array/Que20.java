/*Write a Java program or function which takes two sorted integer arrays as input and merge them in sorted order. For example, If arrayA = {-7, 12, 17, 29, 41, 56, 79} and arrayB = {-9, -3, 0, 5, 19} are two sorted integer arrays then mergedArray must be {-9, -7, -3, 0, 5, 12, 17, 19, 29, 41, 56, 79}. Note that mergedArray is also sorted.*/

import java.util.Arrays;

public class Que20 {
    public static void main(String[] args) {
        int[] arr1 = { -7, 12, 17, 29, 41, 56, 79 };
        int[] arr2 = { -9, -3, 0, 5, 19 };

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int[] result = new int[arr1.length + arr2.length];
        int i=0,i1 = 0, i2 = 0;

        while (i1 < arr1.length && i2 < arr2.length) {
            if (arr1[i1] < arr2[i2]) result[i++] = arr1[i1++];
            else result[i++]=arr2[i2++];
        }

        while(i1<arr1.length) result[i++]=arr1[i1++];
        
        while(i2<arr2.length) result[i++]=arr2[i2++];

        System.out.println(Arrays.toString(result));
    }
}
