class Que2{
	int arr1[], arr2[],count;

	Que2(){
		count=1;
		arr1= new int[setArraySize()];
		setArrayElement(arr1);
		count++;
		arr2= new int[setArraySize()];
		setArrayElement(arr2);
	}
	
	void setArraySize(){
		System.out.println("Enter size of an array"+count);
		size=sc.nextInt();
	}

	void setArrayElement(int arr[]){
		for(int i=0;i<arr.length;++i){
			Sytem.out.println("Enter value for "+(i+1)+" of an array "+count);
			arr[i]=sc.nextInt();
		}
	}

	void getArrayElement(int arr[]){
		for(int i: arr)
			System.out.print(i+" ");
		System.out.println();
	}

	void showEqualElemnets(){};
}