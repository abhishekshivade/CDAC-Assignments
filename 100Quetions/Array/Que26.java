/*Write a Java program or function which finds triplets in the given array whose sum is equal to given number. For example, if [7, 5, 9, 3, 0, 8, 6] is the given array and 12 is the given number then array triplets whose sum is equal to 12 are [7, 5, 0] and [9, 3, 0].*/

import java.util.Arrays;

public class Que26 {
    public static void main(String[] args) {
        int[] arr={4,5,7,3,6,2,0,1};
        int sum=7;
        Arrays.sort(arr);

        for(int i=0;i<arr.length-2;i++){
            int l=i+1;
            int r=arr.length-1;

            while(l<r){
                if(arr[i]+arr[l]+arr[r]==sum){
                    System.out.println(i+","+l+","+r);
                    l++;
                    r--;
                }else if(arr[i]+arr[l]+arr[r]<sum) l++;
                else r--;
            }
        }
    }
}
