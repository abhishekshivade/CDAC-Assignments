//Incomplete

/*public Write a Java program or function which prints all contiguous sub arrays with given sum. For example, if [5, -9, 4, -2, 7, 1, -4, -3, -7] is the given array and -7 is the given sum then contiguous sub arrays with sum -7 are [-9, 4, -2], [-4, -3] and [-7].*/

public class Que23 {

    static void print(int[] arr, int start, int end) {
        for (int i = start; i <= end; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 5, -9, 4, -2, 7, 1, -4, -3, -7 };

        // int cSum = arr[0];
        // int start = 0;
        int tSum = -7;
        int n = arr.length;

        System.out.println("target sum : " + tSum);
        System.out.println("Arrays are");

        for (int i = 0; i < n; i++) {
            // while(cSum>tSum && start<i-1){
            // cSum-=arr[start];
            // start++;
            // }

            // if(cSum==tSum) print(arr,start,i-1);

            // if(i<n) cSum+=arr[i];

            int csum = 0;

            for (int j = i; j < n; j++) {
                csum += arr[0];

                if (csum == tSum)
                    print(arr, i, j);
            }
        }
    }
}
