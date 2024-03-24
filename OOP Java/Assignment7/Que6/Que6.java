import java.util.Scanner;

class Que6{

	static void findMax(int arr[]){
		int max1=arr[0],max2=arr[0],max3=arr[0];
		
		for(int i:arr){
			System.out.println("i : "+i);

			/*
			if(max2>i && max3<i) {
				System.out.println("Checking max3 : "+max3);
				
				max3=i;
			}else if(max1>i && max2<i) {
				System.out.println("Checking max2 : "+max2);
				max2=i;
			}else if(max1<i) {
				System.out.println("Checking max1 : "+max1);
				max1=i;
			}
			*/
			
			System.out.println("Checking max1 : "+max1);
			if(max1<i) max1=i;

			/*
			System.out.println("Checking max2 : "+max2);
			if(max1>i && max2<i) max2=i;
		
			System.out.println("Checking max3 : "+max3);
			if(max2>i && max3<i) max3=i;
			*/

		}

		for(int i:arr){
			System.out.println("i : "+i);
			System.out.println("Checking max2 : "+max2);
			//((max2<i) && (max1>i)) ? (max2=i) :""; 
			if(max1>i && max2<i) max2=i;
		}

		for(int i:arr){
			System.out.println("i : "+i);
			System.out.println("Checking max3 : "+max3);
			//((max3<i) && (max2>i)) ? (max3=i) :""; 
			if(max2>i && max3<i) max3=i;
		}
	
		System.out.println("First Max number is : "+max1);
		System.out.println("Second Max number is : "+max2);
		System.out.println("Third Max number is : "+max3);
	}
	
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);

		System.out.print("Enter size of an array : ");
		int[] array=new int[sc.nextInt()];

		System.out.println();

		System.out.println("Enter elements of an array");
		for(int i=0;i<array.length;i++){
			System.out.print("Enter "+(i+1)+" value of an array : ");
			array[i]=sc.nextInt();
			System.out.println();
		}

		System.out.println("Array you given");

		for(int i:array)
			System.out.print(i+" ");
		System.out.println();

		findMax(array);
	}
}