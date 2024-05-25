package LS;

/**
 * LS
 */
public class LS {

    static void search(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println(arr[i]+" Found");
                return;
            }
        }

        System.out.println(key+" not found");
    }

    public static void main(String[] args) {
        int[] arr={12,5,8,96,5,7,3,4};

        int key=2;

        search(arr,key);
    }
}