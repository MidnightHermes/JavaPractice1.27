package JavaPractice;

public class Burger implements FoodItem {
	
	private int quantity;
	private final int PRICE = 4;

	public Burger(int newQuantity) {
		setQuantity(newQuantity);
	}
	
	@Override
	public int total() {
		int total = quantity * PRICE;
		if (quantity > 1) {
			System.out.println("The burgers will cost you: $" + total);
		}
		else {
			System.out.println("The burger will cost you: $" + total);
		}
		return total;
	}

	@Override
	public int getQuantity() {
		return quantity;
	}

	@Override
	public void setQuantity(int newQuantity) {
		quantity = newQuantity;
	}

}
