class BmiCalculator{
	public static void main(String arg[]){
		Bmi bmi = new Bmi();

		double height = bmi.getHeight();

		double weight= bmi.getWeight();

		System.out.println("Bmi : "+calculateBmi(height,weight));		
	}
	
	static double calculateBmi(double height,double weight){
			return (weight/(height*height));
		}
}