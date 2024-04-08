// Write a Java program to find continuous sub array whose sum is equal to a given number?

public class Que5 {
    public static void main(String[] args) {
        int[] arr={13,16,8,15,5,4};
        int sum=28;
        int index=0;
        int res=arr[0];

        for(int i=1;i<arr.length;i++){
            
            while(res>sum && index<i-1){
                res-=arr[index];
                index++;
            }

            if(res==sum){
                for(int j=index;j<i;j++)
                    System.out.print(arr[j]+" ");
                return;
            }

            if(i<arr.length) res+=arr[i];
        }
    }
}
