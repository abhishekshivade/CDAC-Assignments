// Write a Java program to separate zeros from non-zeros in an integer array?

import java.util.Arrays;

public class Que7 {
    public static void main(String[] args) {
        int[] arr={1,5,0,6,7,0};
        int index=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
                index++;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
