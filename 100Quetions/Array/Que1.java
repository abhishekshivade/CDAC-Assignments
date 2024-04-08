/*
Write a java program to find duplicate elements in an array
*/

import java.util.Scanner;

class Que1{

	static void findDuplicate(int[] arr){
		for(int i:arr){
			int count =1;
			for(int j=i; j<arr.length;j++){
				if(i==arr[j]) count++;
			}
			/*if(count>1)*/ System.out.println(i+" found "+count+" times in given array");
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of an array : ");
		int[] array = new int[sc.nextInt()];
		
		System.out.println("Enter Array Elements");
		for(int i=0;i<array.length;i++){
			System.out.print("Enter "+(i+1)+" value of array : ");
			array[i]=sc.nextInt();
		}

		System.out.println("Array you entered");
		for(int i:array) System.out.print(i+" ");
		System.out.println();

		findDuplicate(array);
		
		sc.close();
	}
}