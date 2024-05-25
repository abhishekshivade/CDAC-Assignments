/*Write a Java program or function which takes two unsorted integer arrays as input and merge them in a sorted order. For example, if arrayA = {12, -7, 18, 9, 37, -1, 21} and arrayB = {27, 8, 71, -9, 18} are two unsorted integer arrays then mergedArray must be {-9, -7, -1, 8, 9, 12, 18, 18, 21, 27, 37, 71}*/

import java.util.Arrays;

public class Que19 {
 public static void main(String[] args) {
    int[] arr1={12,-7,18,9,37,-1,21};
    int[] arr2={27,8,71,-9,18};

    int[] result=new int[arr1.length+arr2.length];

    int index=0;

    for(int i:arr1) result[index++]=i;
    for(int i:arr2) result[index++]=i;

    Arrays.sort(result);

    System.out.println(Arrays.toString(result));
 }   
}
