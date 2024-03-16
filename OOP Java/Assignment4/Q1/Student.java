import java.util.Scanner;

class Student {
	private int id, age;
	private String name,grade;

	public void acceptDetails() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Student Name: ");
		this.name = sc.nextLine();

		System.out.print("Enter Student Id: ");
		this.id = sc.nextInt();

		System.out.print("Enter Student Age: ");
		this.age = sc.nextInt();

		System.out.print("Enter Student Grade: ");
		this.grade=sc.next();

		sc.close();
	}

	public void printDetails() {
		System.out.println("Student Details are:- ");
		System.out.println("Student Name: " + this.name);
		System.out.println("Student Id: " + this.id);
		System.out.println("Student Age: " + this.age);
		System.out.println("Student Grade: " + this.grade);
	}
}