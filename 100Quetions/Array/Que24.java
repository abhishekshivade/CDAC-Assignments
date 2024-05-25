/*Write a Java program or function which sorts an array containing only 0s and 1s without using any inbuilt methods. For example, if [1, 0, 1, 1, 0, 1, 0, 0] is an input array then after sorting it should look like [0, 0, 0, 0, 1, 1, 1, 1]. It is also called sorting of binary array. Let’s see some of the methods to sort array of 0s and 1s.*/

import java.util.Arrays;

public class Que24 {
  public static void main(String[] args) {
    int arr[]={0,0,0,1,1,1,0,1,0,1,1,1};

    int zero=0;

    for(int i:arr){
        if(i==0) zero++;
    }

    int[] arr1= new int[arr.length];

    for(int i =0;i<arr.length;i++){
        if(i<zero) arr1[i]=0;
        else arr1[i]=1;
    }

    System.out.println(Arrays.toString(arr1));
  }  
}
