/*Write a Java program or function which sorts an array containing only 0s, 1s and 2s. Your program should take an integer array of 0s, 1s and 2s as input array and sort them without using any inbuilt sorting methods.*/

import java.util.Arrays;

public class Que25 {

    static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

  public static void main(String[] args) {
    int arr[]={0,2,0,2,1,1,0,1,0,1,2,1};

    // int zero=0;
    // int one=0;
    // int two=0;

    // for(int i:arr){
    //     if(i==0) zero++;
    //     if(i==1) one++;
    //     if(i==2) two++;
    // }

    // int[] arr1= new int[arr.length];

    // for(int i =0;i<arr.length;i++){
    //     if(i<zero) arr1[i]=0;
    //     else if(i<(zero+one)) arr1[i]=1;
    //     else arr1[i]=2;
    // }

    // System.out.println(Arrays.toString(arr1));

    int mid=0;
    int low=0;
    int high=arr.length-1;

    while(mid<=high){
        if(arr[mid]==0){
            swap(arr, low, mid);
            low++;
            mid++;
        }else if(arr[mid]==2){
            swap(arr, mid, high);
            high--;
        }else mid++;
    }

    System.out.println(Arrays.toString(arr));
  }  
}
