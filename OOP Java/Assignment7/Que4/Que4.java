import java.util.Scanner;

class Que4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter size of an Array : ");

		int[] array=new int[sc.nextInt()];

		System.out.println();

		System.out.println("Enter elements of an array");
		System.out.println();

		for(int i=0;i<array.length;i++){
			System.out.print("Enter "+(i+1)+" element of an array : ");
			array[i]=sc.nextInt();
			System.out.println();
		}

		System.out.println("Array you given");
		for(int i:array)
			System.out.print(i+" ");

		System.out.println();

		System.out.println("Printing in reverse array");

		for(int i=array.length-1;i>=0;i--)
			System.out.print(array[i]+" ");
		System.out.println();

		int temp=0,j=array.length-1;

		for(int i=0;i<array.length/2;i++,j--){
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		}
		
		System.out.println("Reversed array");

		for(int i:array)
			System.out.print(i+" ");

	}
}