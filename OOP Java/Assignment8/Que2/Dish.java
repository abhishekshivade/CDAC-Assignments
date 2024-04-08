class Dish{
	private String dishName;
	private float dishPrice;

	

	Dish(String dishName,float dishPrice){
		this.dishName=dishName;
		this.dishPrice=dishPrice;
	}

	void setDishName(String dishName){
		this.dishName=dishName;
	}

	String getDishName(){
		return dishName;
	}

	void setDishPrice(float dishPrice){
		this.dishPrice=dishPrice;
	}

	float getDishPrice(){
		return dishPrice;
	}
}