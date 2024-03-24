import java.util.Scanner;

class Que3{

	static void readIndex(int x, int[] arr){
		if(x>=arr.length) throw new ArrayIndexOutOfBoundsException("Index is greater than array length");
		System.out.println(x+" of array is : "+arr[x]);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of an arrray : ");
		int[] array=new int[sc.nextInt()];
		System.out.println();

		System.out.println("Enter Array Eements");
		for(int i=0;i<array.length;i++){
			System.out.print("Enter "+(i+1)+" value of array : ");
			array[i]=sc.nextInt();
		}
	
		System.out.print("Enter index you to read from array : ");
		readIndex(sc.nextInt(), array);
	}
}