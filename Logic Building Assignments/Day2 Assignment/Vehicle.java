class Vehicle{
	int price;
	String color;
	String model;
	
	Vehicle(int p, String c, String m){
		price=p;
		color = c;
		model = m;
	}

	int display(){
		System.out.println("Vehicle price : "+price);
		System.out.println("Vehicle color : "+color);
		System.out.println("Vehicle model : "+model);
		return 0;
	}

	public static void main(String args[]){
		Vehicle v1 = new Vehicle(10,"Black","XLS");
		Vehicle v2 = new Vehicle(15,"White","C3");

		System.out.println("Vehicle 1");
		System.out.println(v1.display());
		System.out.println("Vehicle 2");
		System.out.println(v2.display());
	}
}