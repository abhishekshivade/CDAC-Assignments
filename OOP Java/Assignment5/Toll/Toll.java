import java.util.Scanner;

class Toll{


	static void calculateTollFee(Vehicle vehicle){
		if(vehicle.getVehicleType().equals("passenger")){
			vehicle.setTollFee(0.25*vehicle.getDistanceTravelled()*vehicle.getNumAxles());
		}
		if(vehicle.getVehicleType().equals("commercial")){
			vehicle.setTollFee(0.50*vehicle.getDistanceTravelled()*vehicle.getNumAxles());
		}
		System.out.println("Toll Fee Calculated.");
	}

	static double generateBill(Vehicle vehicle){
		System.out.println("Vehicle Type	: "+vehicle.getVehicleType());
		System.out.println("Number of Axles	: "+vehicle.getNumAxles());
		System.out.println("Distance Travelled	: "+vehicle.getDistanceTravelled()+"miles");
		System.out.println("Toll Fee		: "+vehicle.getTollFee()+"$");
		System.out.println("Processing Fee	: 2.00$");
		double totalAmountDue=vehicle.getTollFee()+2.00;
		System.out.println("Total Amount Due	: "+totalAmountDue+"$");
		vehicle.setTotalAmountDue(totalAmountDue);
		return totalAmountDue;
	}

	static void showMenu(){
		Vehicle vehicle = new Vehicle();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		do{
			System.out.println("Welcome to Toll Collection System");
			System.out.println("1. Enter Vehicle Type");
			System.out.println("2. Enter Number of Axles");
			System.out.println("3. Enter Distance Travelled");
			System.out.println("4. Calculate Toll Fee");
			System.out.println("5. Generate Bill");
			System.out.println("0. Exit");
			
			System.out.print("Enter option : ");
			choice=sc.nextInt();
			System.out.println();

			if(choice>6){
				System.out.println("Select correct option");
			}else{
				switch(choice){
					case 1:
						System.out.print("Enter Vehicle Type : ");
						vehicle.setVehicleType(sc.next());
						break;

					case 2:
						System.out.print("Enter Number of Axles : ");
						vehicle.setNumAxles(sc.nextInt());
						break;

					case 3:
						System.out.print("Enter Distance Travelled : ");
						vehicle.setDistanceTravelled(sc.nextDouble());
						break;

					case 4:
						System.out.println("Calculating toll...");
						calculateTollFee(vehicle);
						break;

					case 5:
						System.out.println("Generating Bill...");
						generateBill(vehicle);
						break;

					case 0:
						System.out.print("Logged out successfully...!");
						sc.close();
						System.exit(0);
				}
			}
		}while(choice!=0);
	}

	public static void main(String[] args){
		Toll.showMenu();
	}
}