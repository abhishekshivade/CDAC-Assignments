// Write a Java program to remove duplicate elements from an array?

public class Que13 {
    public static void main(String[] args) {
        int[] arr={5,7,9,4,5,7,3,1};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j] && arr[i]!=0) arr[j]=0;
            }
        }

        for(int i:arr){
            if (i!=0) System.out.print(i+" ");
        }
    }
}
