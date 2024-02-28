class Box{
	float height;
	float width;
	float breadth;

	Box(float h, float w, float b){
		height = h;
		width = w;
		breadth = b;
	}

	float getVolume(){
		return height*width*breadth;
	}

	float getArea(){
		return width*breadth;
	}

	public static void main(String[] arg){
		Box b1 = new Box(10.5f, 12.0f, 6.4f);
		Box b2 = new Box(9.2f, 10.5f, 11.0f);
		
		System.out.println("Volume of box1 : "+b1.getVolume());
		System.out.println("Area of box1 : "+b1.getArea());
		System.out.println("Volume of box2 : "+b2.getVolume());
		System.out.println("Area of box2 : "+b2.getArea());
	}
	
}