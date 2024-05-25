/*Write a Java program or function which takes two integer arrays (Sorted or Unsorted) as input and merge them into single sorted array without duplicates. For example, if {7, -5, 3, 8, -4, 11, -19, 21} and {6, 13, -7, 0, 11, -4, 3, -5} are two unsorted integer arrays then sorted merged array without duplicates will be {-19, -7, -5, -4, 0, 3, 6, 7, 8, 11, 13, 21}*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Que18 {
    public static void main(String[] args) {
        int[] arr1= {7,-5,3,8,-4,11,-19,21};
        int[] arr2={6,13,-7,0,11,-4,3,-5};

        int[] temp= new int[arr1.length+arr2.length];

        int index=0;
            for(int j:arr1) temp[index++]=j;
            for(int j:arr2) temp[index++]=j;
        
        Set<Integer> set=new HashSet<>();

        for(int j:temp) set.add(j);

        int[] result = new int[set.size()];

        index=0;

        for(int i:set) result[index++]=i;

        Arrays.sort(result);

        System.out.println(Arrays.toString(result));
    }
}
