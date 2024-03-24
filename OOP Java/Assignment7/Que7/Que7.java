import java.util.Scanner;

class Que7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of an array 1 : ");
		int[] arr1=new int[sc.nextInt()];

		System.out.println();

		System.out.println("Enter elements of array 1");

		for(int i=0; i<arr1.length;i++){
			System.out.print("Eneter "+(i+1)+" element of array 1 : ");
			arr1[i]=sc.nextInt();
			System.out.println();
		}

		System.out.print("Enter size of an array 2 : ");
		int[] arr2=new int[sc.nextInt()];

		System.out.println();

		System.out.println("Enter elements of array 2");

		for(int i=0; i<arr2.length;i++){
			System.out.print("Eneter "+(i+1)+" element of array 2 : ");
			arr2[i]=sc.nextInt();
			System.out.println();
		}

		System.out.println("Array 1 you given");

		for(int i:arr1)
			System.out.print(i+" ");
		System.out.println();

		System.out.println("Array 2 you given");

		for(int i:arr2)
			System.out.print(i+" ");
		System.out.println();

		int[] result = new int[arr1.length+arr2.length];

		int j=0,k=0,i=0;

		/*
		for(i;i<result.length-1;i+=2){
			System.out.println("i : "+i);
			if(j<arr1.length){
				result[i]=arr1[j];
				System.out.println("arr1 of "+j+" is : "+arr1[j]);
				j++;
			}

			if(k<arr2.length){
				result[i+1]=arr2[k];
				System.out.println("arr2 of "+k+" is : "+arr2[k]);
				k++;
			}
		}
		*/

		while(i<arr1.length && j<arr2.length){
			result[k++]=arr1[i++];
			result[k++]=arr2[j++];
		}

		while(i<arr1.length)
			result[k++]=arr1[i++];

		while(i<arr2.length)
			result[k++]=arr2[j++];

		//for(i;)i<result.length

		System.out.println("Combined result array");

		for(int x:result)
			System.out.print(x+" ");
	}
}