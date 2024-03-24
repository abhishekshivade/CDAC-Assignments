import java.util.Scanner;

class Que3{
	public static void main(String arg[]){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of an array");

		int array[]=new int[sc.nextInt()];
		
		System.out.println("Enter elements of an array");

		for(int i=0;i<array.length;i++){
			System.out.print("Enter "+(i+1)+" value of an array : ");
			array[i]=sc.nextInt();
			System.out.println();
		}

		System.out.print("Enter a sum number : ");
		int sum=sc.nextInt();
		System.out.println();

		for(int i: array){
			for(int j: array){
				if(sum==(i+j))
					System.out.println(sum+" = "+i+" + "+j);
			}
		}
	}
}