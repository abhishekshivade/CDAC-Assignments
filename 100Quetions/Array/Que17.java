/*Write a Java program or function which takes an integer array as input and sort array elements in descending order of their frequency. If any two or more elements have same frequency then print which comes first. For example, if [7, 1, 3, 4, 7, 1, 7, 1, 4, 5, 1, 9, 3] is an input array then its elements in descending order of their frequency will be [ 1 1 1 1 7 7 7 3 3 4 4 5 9 ].*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Que17 {
    public static void main(String[] args) {
        int[] arr={7,1,3,4,7,1,4,5,1,9,3};

        Map<Integer,Integer> map= new HashMap<Integer,Integer>();

        for(int i:arr) map.put(i,map.getOrDefault(i,0)+1);

        ArrayList<Integer> list=new ArrayList<>(arr.length);

        for(int i:arr) list.add(i);

        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer n1,Integer n2){
                int f1=map.get(n1);
                int f2=map.get(n2);

                if(f1!=f2) return Integer.compare(f2, f1);
                else return Integer.compare(list.indexOf(n1),list.indexOf(n2));
            }
        });

        int[] result=new int[arr.length];

        for(int i=0;i<list.size();i++) result[i]=list.get(i);

        System.out.println(Arrays.toString(result));
    }
}
