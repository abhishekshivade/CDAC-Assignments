import java.util.Scanner;

class Bmi{
	private double height;
	private double weight;

	private Scanner sc = new Scanner(System.in);

	Bmi(){
		this.height=setHeight();
		this.weight=setWeight();
	}

	double setHeight(){
		System.out.println("Enter height in meters");
		return sc.nextDouble();
	}

	double getHeight(){
		return height;
	}
	
	double setWeight(){
		System.out.println("Enter weight in kgs");
		return sc.nextDouble();
	}

	double getWeight(){
		return weight;
	}
}