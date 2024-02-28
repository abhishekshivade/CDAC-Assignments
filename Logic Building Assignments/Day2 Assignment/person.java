class Person{

	int age = 40;
	float height = 5.8f;
	float weight = 53.40f;
	
	Person(){
		age = 50;
		height = 5.9f;
		weight = 56.0f;
	}

	Person(int a, float h, float w){
		age = a;
		height = h;
		weight = w;
	}

	int display(){
		System.out.println("Age : "+age+", Height : "+height+", Weight : "+weight);
		return 0;
	}

	public static void main(String arg[]){
		Person p1 = new Person();
		Person p2 = new Person(58,5.10f,60.0f);

		p1.display();
		p2.display();
	}
	
}