package Que1;

import java.util.Scanner;

public class Que1 {
    
    private int arr[];

    Scanner sc = new Scanner(System.in);

    Que1(){
	System.out.println("Enter size of an array arr");
        arr = new int[sc.nextInt()];
    }

    void setElements(){
        for(int i=0;i<arr.length;i++){
            System.out.println("Enetr int value for "+(i+1)+" value of an array arr");
            arr[i]=sc.nextInt();
        }
    }

    int getElements(){

        int element=0;
	
	System.out.println("Elements of an array arr");
        
        for (int i : arr) {
            System.out.print(i+" ");
        }
	
	return 0;
    }

}
