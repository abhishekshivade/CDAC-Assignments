import java.util.Scanner;

class Que8{

	static void runningAvg(int arr[]){

		int sum=0,avg=0;

		for(int i=2;i<arr.length;i++){
			sum=arr[i-2]+arr[i-1]+arr[i];
			System.out.print(sum/3+" ");
		}
		
		System.out.println();
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of an array : ");		

		int[] array = new int[sc.nextInt()];

		System.out.println();
		
		System.out.println("Array you entered");

		for(int i=0;i<array.length;i++){
			System.out.print("Enter "+(i+1)+" value of array : ");
			array[i]=sc.nextInt();
			System.out.println();
		}

		for(int i:array)
			System.out.print(i+" ");
		System.out.println();

		runningAvg(array);		
	}
}