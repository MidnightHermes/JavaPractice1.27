package JavaPractice;

public class Salad implements FoodItem {
	
	private int quantity;
	private final int PRICE = 1;

	public Salad(int newQuantity) {
		setQuantity(newQuantity);
	}
	
	@Override
	public int total() {
		int total = quantity * PRICE;
		System.out.println("The salad will cost you: $" + total);
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
