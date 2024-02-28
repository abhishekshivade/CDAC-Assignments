class Demo{

	public static void main(String[] arg){
		
		int firstNumber = 6;
		int secondNumber = 3;

		System.out.println("Choose an operation :");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");

		int result;
		
		for(int choice = 1; choice <=4 ; choice++){
			switch(choice){
				case 1:
					result = firstNumber+secondNumber;
					System.out.println(firstNumber+" + "+secondNumber+" = "+result);
					break;

				case 2:
					result = firstNumber-secondNumber;
					System.out.println(firstNumber+" - "+secondNumber+" = "+result);
					break;

				case 3:
					result = firstNumber*secondNumber;
					System.out.println(firstNumber+" * "+secondNumber+" = "+result);
					break;

				case 4:
					result = firstNumber/secondNumber;
					System.out.println(firstNumber+" / "+secondNumber+" = "+result);
					break;
			}
		}
	}	
}