class Employee{
	String name;
	int rollNo;
	double percentage;

	void display(){
		System.out.println("Name : "+name);
		System.out.println("Roll No : "+rollNo);
		System.out.println("Percentage : "+percentage);
	}

	void addDetails(String n, int rn, double p){
		name=n;
		rollNo=rn;
		percentage=p;
	}


	void addDetails(int rn, double p){
		rollNo=rn;
		percentage=p;
	}
}