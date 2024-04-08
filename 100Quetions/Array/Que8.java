// Given an integer array, you have to find all the leader elements in this array. An element is said to be leader if all the elements on it’s right side are smaller than it. Rightmost element is always a leader. For example, if {14, 9, 11, 7, 8, 5, 3} is the given array then {14, 11, 8, 5, 3} are the leaders in this array.

class Que8{
    public static void main(String[] args) {
        int[] arr={8,23,19,21,15,6,11};
        boolean flag=false;

        System.out.println(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]) flag=true;
                else{
                    flag=false;
                    break;
                }
            }
            if(flag)System.out.println(arr[i]);
        }
    }
}