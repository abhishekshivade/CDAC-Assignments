class MinMax{
	public static void main(String arg[]){
		
		int a[]={5,4,3,9,1,7,9};
		int min=a[0],max=0;

		for(int i=0;i<a.length;i++){
			if(min>a[i]) min=a[i];
			if(max<a[i]) max=a[i];
		}

		System.out.println("Min : "+min);
		System.out.println("Max : "+max);
	}
}