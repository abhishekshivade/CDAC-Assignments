public class Duplicate{
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5};
        
        int newSize = arr.length;
        
        for (int i=0; i<newSize-1; i++) {
            for (int j=i+1; j<newSize; j++) {
                if (arr[i] == arr[j]) {

                    for (int k=j; k<newSize-1; k++) {
                        arr[k] = arr[k+1];
                    }
                    newSize--;
                    j--;
                }
            }
        }
        
        int[] newArray = new int[newSize];

        for (int i=0; i<newSize; i++) {
            newArray[i] = arr[i];
        }
        
        for (int i=0; i<newSize; i++) {
            System.out.print(newArray[i]+",");
        }
    }
}
