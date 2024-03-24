import java.util.Scanner;

class Que5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of an Array : ");
		int[] array=new int[sc.nextInt()];
		
		System.out.println();

		for(int i=0;i<array.length;i++){
			System.out.print("Enter "+(i+1)+" element of an array : ");
			array[i]=sc.nextInt();
			System.out.println();
		}
		
		System.out.println("Array you given");
		for(int i:array){
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		int max=0,min=array[0];

		for(int i:array){
			if(max<i) max=i;
			if(min>i) min=i;
		}

		System.out.println("max = "+max+" | min = "+min);
	}
}