// Write a Java program to find all pairs of elements in an integer array whose sum is equal to a given number?
class Que4{
	public static void main(String[] args){
		int[] arr={1,3,4,6,8,7,9};

		int sum=10;

		for(int i: arr){
			for(int j:arr){
				if(i+j==sum) System.out.println(sum+" = "+i+" + "+j);
			}
		}
	}
}