// Write a Java program to count occurrences of each element in an array?

import java.util.HashMap;
import java.util.Map;

public class Que11 {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 5, 7, 8, 2, 6, 7, 4, 5 };
        // boolean[] visited = new boolean[arr.length];

        // for (int i=0;i<arr.length;i++) {
        //     if (!visited[i]) {
        //         int count = 1;
        //         for (int j = i + 1; j < arr.length; j++) {
        //             if (arr[i] == arr[j]){
        //                 visited[i]=true;
        //                 count++;
        //             }
        //         }

        //         System.out.println(arr[i] + " occured " + count + " times");
        //     }
        // }

        Map<Integer,Integer> map=new HashMap<>();

        for(int i:arr){
            if(map.containsKey(i)) map.put(i,map.get(i)+1);
            else map.put(i,1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int num=entry.getKey();
            int count=entry.getValue();

            System.out.println(num+" occurred "+count+" times");
        }

        
    }
}
