class SecondLargest{
	public static void main(String arg[]){
		int a[]={5,3,9,7,1};

		int max=a[0], max1=a[1];

		for(int i=0;i<a.length;i++){
			if(max<a[i]){
				max=a[i];
			}
		}

		for(int i=0;i<a.length;i++){
			if(max!=a[i] && max1<a[i] ){
				max1=a[i];
			}
		}
		
		System.out.println("Second Largest Element : "+max1);
	}
}