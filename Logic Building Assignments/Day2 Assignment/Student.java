class Student{
	String name = "student1";
	int sub1 = 60;
	int sub2 = 50;
	int sub3 = 75;
	//int total;

	int sum(){
		return sub1+sub2+sub3;
	}

	int total = sum();

	float average(){
		return total/3;
	}

	public static void main(String[] arg){
		Student s1 = new Student();
		System.out.println("Name of student : "+s1.name);
		System.out.println("Total marks : "+s1.total);
		System.out.println("Average : "+s1.average());
	}
}