import java.util.ArrayList;

class Menu {
	protected ArrayList<Dish> menu = new ArrayList<Dish>();

	void viewMenu() {
		if (menu.isEmpty()) {
			System.out.println("Menu list is empty, please add menu");
		} else {

			System.out.println("==============================================");
			System.out.printf("%-8s %-20s %-12s\n", "Sr. No.", "Dish Name", "Dish Price");
			System.out.println("==============================================");
			for (int i = 0; i < menu.size(); i++) {
				Dish dish = menu.get(i);
				if (dish.getDishPrice() > 0.00 && dish.getDishName() != null) {

					System.out.printf("%-8s %-20s %-12.2f\n", (i + 1), dish.getDishName(), dish.getDishPrice());
				}
			}
			System.out.println("==============================================");
		}
	};

	void addDish(String dishName, float dishPrice) {
		menu.add(new Dish(dishName, dishPrice));
	};

	void removeDish(int index) {
		if (index > 0 && index <= menu.size())
			menu.remove(index - 1);
		else
			System.out.println("Invalid dish index");
	};

	void modifyDish(int index, String dishName, float dishPrice) {
		if (index > 0 && index <= menu.size()) {
			menu.get(index - 1).setDishName(dishName);
			menu.get(index - 1).setDishPrice(dishPrice);
		} else
			System.out.println("Invalid dish index");
	};
}