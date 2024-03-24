import java.util.Scanner;

class Que10{
	/*
	static boolean checkAscending(int[] arr){
		boolean ascending=false;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				ascending=false;
				break; 
			}else{
				ascending=true;
			}
		}
`		return ascending;
	}

	static boolean checkDescending(int[] arr){
		boolean descending=false;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]<arr[i+1]){
				descending=false;
				break; 
			}else{
				descending=true;
			}
		}
`		return descending;
	}
	*/
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		boolean ascending=false,descending=false;

		System.out.print("Enter size of array : ");
		int[] array =new int[sc.nextInt()];
		System.out.println();

		System.out.println("Enter elements of an array");

		for(int i=0;i<array.length;i++){
			System.out.print("Enter "+(i+1)+" value of aaray : ");
			array[i]=sc.nextInt();
			System.out.println();
		}

		System.out.println("Entered Array");

		for(int i:array){
			System.out.print(i+" ");
		}
		System.out.println();

		for(int i=0;i<array.length-1;i++){
			if(array[i]>array[i+1]){
				ascending=false;
				break; 
			}else{
				ascending=true;
			}
		}
		
		for(int i=0;i<array.length-1;i++){
			if(array[i]<array[i+1]){
				descending=false;
				break; 
			}else{
				descending=true;
			}
		}

		if(ascending) System.out.println("Array is ascending");
		else if(descending) System.out.println("Array is descending");
		else System.out.println("Array is random");
	}
}