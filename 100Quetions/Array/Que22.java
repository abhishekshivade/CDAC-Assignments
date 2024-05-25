/*Write a Java program or function which takes an integer array as input and prints contiguous subarray with maximum sum. For example, if {2, -3, 7, -4, 2, 5, -8, 6, -1} is the given array then contiguous subarray with maximum sum is {7, -4, 2, 5} and its sum is 10.*/

public class Que22 {
    public static void main(String[] args) {
        int[] arr = { 2, -3, 7, -4, 2, 5, -8, 6, -1 };

        int sum = arr[0];
        int start = 0;
        int end = 0;

        int currSum = 0;
        int currStart = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum < 0) {
                currSum = 0;
                currStart = i + 1;
            } else if (currSum > sum) {
                sum = currSum;
                start = currStart;
                end = i;
            }
        }

        System.out.println(sum);

        for(int i=start;i<=end;i++) System.out.print(arr[i]+" ");
    }
}
