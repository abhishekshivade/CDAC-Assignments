class ArrayAverage{
	public static void main(String arg[]){
		int a[]={5,4,3,9,1,7,9};
		float sum=0, avg=0;
		
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		
		avg = sum/a.length;
		
		System.out.println("Average of Array elements : "+avg);
	}
}