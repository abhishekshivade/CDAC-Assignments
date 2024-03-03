class ReverseArr{
	public static void main(String arg[]){
		int a[]={1,2,3,4,5};

		for(int i=0, j=a.length-1;i<a.length/2;i++,j--){
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}

		for(int i:a) System.out.print(i);
	}
}