package JavaPractice;

import java.util.Scanner;

public class Salad implements FoodItem {
	
	private int quantity;
	private final int PRICE = 1;

	public Salad() {
		setQuantity(getQuantity());
	}
	
	@Override
	public int total() {
		int total = quantity * PRICE;
		System.out.println("The salad will cost you: $" + total);
		return total;
	}

	@Override
	public int getQuantity() {
		System.out.println("How many?");
		Scanner input = new Scanner(System.in);
		int quantity = input.nextInt();
		return quantity;
	}

	@Override
	public void setQuantity(int newQuantity) {
		quantity = newQuantity;
	}

}
