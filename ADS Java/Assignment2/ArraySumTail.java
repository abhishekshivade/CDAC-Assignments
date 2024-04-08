// calculating sum of array elements using tail recursion

public class ArraySumTail {
        
    static int sum(int[] arr, int index, int result) {
        if (index >= arr.length) {
            return result;
        }
        
	// calculating array sum index for travresing
        return sum(arr, index + 1, result + arr[index]);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};

        System.out.println(sum(arr,0,0));
    }    
}
