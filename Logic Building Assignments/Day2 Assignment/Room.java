class Room{
	int length = 10;
	int width = 15;
	int height = 12;
	
	int calculateVolume(){
		return length*width*height;
	}

	public static void main(String[] arg){
		Room r = new Room();
		System.out.println("Volume of room is : "+r.calculateVolume());		
	}
}