// If ‘n’ is the positive number and ‘a’ is an array of integers of length n-1 containing elements from 1 to n. Then find the missing number in ‘a’ in the range from 1 to n. Occurrence of each element is only once. i.e ‘a’ does not contain duplicates.

public class Que9 {
    public static void main(String[] args) {
        int n=8;

        int[] arr={1,4,2,3,7,8,6};

        int sum=(n*(n+1))/2;

        int arrSum=0;

        for(int i:arr){
            arrSum+=i;
        }

        System.out.println(sum-arrSum);
    }
}
