package BS;

import java.util.Arrays;

public class BS {

    static int search(int[] arr,int key,int l,int r){
        if(r>=1){
            int mid=(l+r)/2;

            if(arr[mid]==key)return mid;

            if(arr[mid]>key) return search(arr, key,l, mid-1);
            if(arr[mid]<key) return search(arr, key,mid+1,r);
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr={12,5,7,6,4,3,8,9};
        Arrays.sort(arr);

        int res=search(arr,2,0,arr.length-1);

        if(res==-1) System.out.println("Not Found");
        else System.out.println("Found");
    }
}
