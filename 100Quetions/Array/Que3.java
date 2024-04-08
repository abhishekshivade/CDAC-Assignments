/* Write a Java program to check the equality of two arrays? */

class Que3{
	public static void main(String[] args){
		int[] arr1={1,2,3,4};
		int[] arr2={1,2,3,5};
		boolean flag=false;

		if(arr1.length==arr2.length){
			for(int i=0;i<arr1.length;i++){
				//(arr1[i]==arr2[i]) ? (flag=true):(flag=false);
				if(arr1[i]==arr2[i]) flag=true;
				else flag=false;
			}
		}else flag=false;

		if(flag) System.out.println("Array is same");
		else System.out.println("Array is not same");
	}
}