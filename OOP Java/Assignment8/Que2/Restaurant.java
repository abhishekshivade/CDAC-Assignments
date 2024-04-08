
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Restaurant {
	static void menuList(Menu menu) throws Exception {

		InputStreamReader input = new InputStreamReader(System.in);

		BufferedReader read = new BufferedReader(input);

		char choice;
		String dishName;
		float dishPrice;

		do {
			System.out.println();
			System.out.println("Welcome to Restaurant");
			System.out.println("a. View menu");
			System.out.println("b. Add new dish");
			System.out.println("c. Remove dish");
			System.out.println("d. Modify dish");
			System.out.println("e. Exit");

			System.out.print("Enter your choice : ");
			choice = (char) read.read();
			read.readLine();
			System.out.println();

			switch (choice) {
				case 'a':
					System.out.println();
					System.out.println("==============================================");
					System.out.println("	Menu List");
					System.out.println();
					menu.viewMenu();
					break;

				case 'b':
					System.out.print("Enter Dish Name : ");
					dishName = read.readLine();

					System.out.print("Enter Dish Price : ");
					dishPrice = Float.parseFloat(read.readLine());

					menu.addDish(dishName, dishPrice);
					
					System.out.println();
					System.out.println("==============================================");
					System.out.println("	Updated Menu List");
					System.out.println();

					menu.viewMenu();
					break;

				case 'c':
					System.out.print("Enter Sr. No. of Dish : ");
					menu.removeDish(Integer.parseInt(read.readLine()));
			
					System.out.println();
					System.out.println("==============================================");
					System.out.println("	Updated Menu List");
					System.out.println();
					menu.viewMenu();
					break;

				case 'd':
					System.out.println();
					System.out.print("Enter Sr. No. of Dish : ");
					int index = Integer.parseInt(read.readLine());

					System.out.print("Enter Dish Name : ");
					dishName = read.readLine();

					System.out.print("Enter Dish Price : ");
					dishPrice = Float.parseFloat(read.readLine());

					menu.modifyDish(index, dishName, dishPrice);

					
					System.out.println();
					System.out.println("==============================================");
					System.out.println("	Updated Menu List");
					System.out.println();
					menu.viewMenu();
					break;

				case 'e':
					System.out.println();
					System.out.println("Thank you for visiting us!");
					System.out.println("Please, Visit again");
					System.exit(0);

				default:
					System.out.println();
					System.out.println("Please enter correct option");
					break;
			}
		} while (choice != 'e');

		read.close();
		input.close();
	}

	public static void main(String[] args) throws Exception {
		try{
			Menu menu = new Menu();
			menuList(menu);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}