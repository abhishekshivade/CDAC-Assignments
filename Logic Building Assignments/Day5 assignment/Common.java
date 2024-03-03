class Common{
	public static void main(String arg[]){
		int arr1[]={1,2,3,4,5};
		int arr2[]={3,4,5,6,7};
		//int temp[]=new int[arr1.length];
		//int count=0;

		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					//temp[i]=arr1[i];
					//count++;
					System.out.print(arr1[i]+",");
				}
			}
		}

		
		//for(int i:temp)
		//	System.out.print(i+",");

		//System.out.println();
		//System.out.println("count : "+count);

		//int common[]=new int[count];

		/*for(int i=0,j=0;i<temp.length;i++){
			if(temp[i]!=0){
				//break;
			//}else{
				j++;
				common[j]=temp[i];
				//break;
			}
		}*/
		
		//for(int i:common)
		//	System.out.println(i);
	}
}