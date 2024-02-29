class Demo{

	public static void main(String[] arg){
		
		int number = 9125, sum=0;
		int userNum = number;
		
		/*for(sum = 0; number!=0; number/=10){
			sum+=number%10;
		}*/

		do{
			sum+=number%10;
			number/=10;
		}while(number!=0);
	
		System.out.println("Sum of digits of "+userNum+" = "+sum);
	}	
}