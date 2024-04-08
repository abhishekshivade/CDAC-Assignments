/*
Write a Java program to find second largest element in an array of integers?
*/

import java.util.Scanner;

class Que2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of an array : ");
		int[] arr=new int[sc.nextInt()];

		for(int i=0;i<arr.length;i++){
			System.out.print("Enter "+(i+1)+" value of array : ");
			arr[i]=sc.nextInt();
		}

		System.out.println("array you given");

		for(int i:arr) System.out.print(i+" ");
		System.out.println();

		int max=arr[0], max1=arr[0];

		for(int i=0;i<arr.length;i++){
			if(arr[i]>max) max=arr[i];
		}
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]<max && arr[i]>max1) max1=arr[i];
		}
	
		System.out.println("Largest : "+max);
		System.out.println("2nd Largest : "+max1);

		sc.close();
	}
}