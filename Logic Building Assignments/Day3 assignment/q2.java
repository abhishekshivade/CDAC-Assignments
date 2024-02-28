class Demo{

	public static void main(String[] arg){
		
		int number = 9125, sum;
		int userNum = number;
		
		for(sum = 0; number!=0; number/=10){
			sum+=number%10;
		}
		
		System.out.println("Sum of digits of "+userNum+" = "+sum);
	}	
}