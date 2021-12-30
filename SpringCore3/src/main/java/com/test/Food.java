package com.test;

public class Food {
	private String foodName;
	private int foodPrice;
	private int quantity;
	
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void calculatePrice() {
		System.out.println(foodName+ "is successfully added to your cart");
		int Price = foodPrice*quantity;
		System.out.println("You have to pay Rs. "+Price);
	}

}
