import java.util.Scanner;
import java.util.Arrays;

class Que1{

	static Scanner sc = new Scanner(System.in);

	static void acceptArray(int[] array){

		System.out.println("Enter elments of array");

		for(int i=0;i<array.length;i++){
			System.out.print("Enter "+(i+1)+" value of array : ");
			array[i]=sc.nextInt();
			System.out.println();
		}
	}

	static void displayArray(int[] array){
		for(int i:array) System.out.print(i+" ");
		System.out.println();
	}

	static 	int arraySum(int[] array){
		int sum=0;

		for(int i:array) sum+=i;

		return sum;
	}

	static 	int arrayAvg(int[] array){
		int sum=0;

		for(int i:array) sum+=i;
		
		return sum/array.length;
	}

	static 	int largest(int[] array){
		int large=array[0];

		for(int i:array){
			if(large<i) large=i;
		}
		
		return large;
	}

	static 	int smallest(int[] array){
		int small=array[0];

		for(int i:array){
			if(small>i) small=i;
		}
		
		return small;
	}

	/*static void sortArray(int[] array){
		Arrays.sort(array);

		for(int i:array) System.out.print(i+" ");
	}*/

	public static void main(String[] args){

		System.out.print("Enter size of an array : ");
		int[] array=new int[sc.nextInt()];
		System.out.println();

		acceptArray(array);

		System.out.println("Entered Array");
		displayArray(array);

		System.out.println("Sum of Array : "+arraySum(array));
		System.out.println("Average of Array : "+arrayAvg(array));
		System.out.println("Largest of Array : "+largest(array));
		System.out.println("Smallest of Array : "+smallest(array));
		Arrays.sort(array);
		System.out.println("Sorted Array");
		displayArray(array);
	}
}