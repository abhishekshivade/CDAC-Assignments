// Write a Java program to reverse an array without using an additional array?

import java.util.Arrays;

public class Que12 {
    public static void main(String[] args) {
        int[] arr={1,5,3,6,8};

        int temp=0;

        for(int i=0,j=arr.length-1;i<arr.length/2;i++,j--){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        System.out.println(Arrays.toString(arr));
    }    
}