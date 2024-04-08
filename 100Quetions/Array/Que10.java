// Write a Java program to convert an array to ArrayList and an ArrayList to array

import java.util.ArrayList;
import java.util.Arrays;

public class Que10 {
    public static void main(String[] args) {
        int[] arr={1,2,6,5,7,9,8,10};

        ArrayList<Integer> list=new ArrayList<Integer>();

        for(int i:arr){
            list.add(i);
        }

        System.out.println("List : "+list);

        int[] listArr=new int[list.size()];

        for(int i=0;i<list.size();i++){
            listArr[i]=list.get(i);
        }

        System.out.println("Array : "+Arrays.toString(listArr));
    }
}
