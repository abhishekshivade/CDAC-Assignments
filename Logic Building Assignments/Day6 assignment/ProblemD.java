public class ProblemD{
	public static void main(String arg[]){
		int[] numbers={1,2,3,4,5};

		for(int i=0;i<numbers.length;i++){
			System.out.println("Number : "+numbers[i]);
		}
	}
}

/*
in for loop condtion adding 1 to length will give error of Index out of bound while iterating, so it should be only length.
*/