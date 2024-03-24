import java.util.Scanner;

class Que2Main{	

	public static void main(String arg[]){
		/*
		Que2 que2 = new Que2();

		que2.setElements(que2.arr1);
		que2.setElements(que2.arr2);

		que2.getElements(que2.arr2);
		que2.getElemnets(que2.arr2);

		que2.showEqualElements();
		*/

		Scanner sc = new Scanner(System.in);
		
		int arr1[]= new int[5];
		int arr2[]= new int[5];
		boolean flag=false;
		
		/*
		System.out.println("/nEnter elements for Array arr1/n");
		setArray(arr1);

		System.out.println();

		System.out.println("/nEnter elements for Array arr2/n");
		setArray(arr2);

		System.out.println("/nElements of Arrray arr1/n");
		showArray(arr1);

		System.out.println("/nElements of Arrray arr2/n");
		showArray(arr1);

		System.out.println("/nChecking Equality of Array/n");
		checkArrayEquality();
		*/

		for(int i=0;i<arr1.length;++i){
			System.out.println("Enter "+i+" value of array arr1");
			arr1[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr1.length;++i){
			System.out.println("Enter "+i+" value of array arr2");
			arr2[i]=sc.nextInt();
		}
		
		System.out.println("Elements of Array arr1");

		for(int i: arr1)
			System.out.print(i+" ");
		
		System.out.println();

		System.out.println("Elements of Array arr2");

		for(int i: arr2)
			System.out.print(i+" ");

		System.out.println();		

		for(int i=0;i<arr1.length;i++){
			if(arr1[i]!=arr2[i]){
				flag=false;
				break;
			}else{
				flag=true;
			}
		}

		if(flag)
			System.out.println("Array arr1 and arr2 are equal");
		else
			System.out.println("Array arr1 and arr2 are not equal");
		
	}

	/*
	Static public void setArray(int arr){
		for(int i=0;i<arr1.length;++i){
			System.out.println("Enter "+i+" value of array ");
			arr[i]=sc.nextInt();
		}
	}
	
	Static public void showArray(int arr){
		for(int i: arr)
			System.out.print(i+" ");
	}

	static public void checkArrayEquality(int arr1, int arr2){

		boolean flag=false;

		for(int i=0;i<arr1.length;i++){
			if(arr1[i]!=arr2[i]){
				flag=false;
				break;
			}else{
				flag=true;
			}
		}

		if(flag)
			System.out.println("Array arr1 and arr2 are equal");
		else
			System.out.println("Array arr1 and arr2 are not equal");
	}
	*/
}