package JavaPractice;

import java.util.Scanner;

public class Demo {

	private static Salad salad;
	private static Burger burger;

	public static void main(String[] args) {
		// Initialize Scanner
		Scanner input = new Scanner(System.in);
		// Prompt user for input 
		System.out.println("Would you like a burger or salad");
		// Decide what to do based on input
		if (((input.nextLine()).toLowerCase()).equals("burger")) {
			System.out.println("Yummy!");
			System.out.print("How many?");
			int quantity = input.nextInt();
			burger = new Burger(quantity);
			burger.total();
		} else {
			System.out.println("Healthy choice!");
			System.out.print("How many?");
			int quantity = input.nextInt();
			salad = new Salad(quantity);
			salad.total();
		}
		
		input.close();
	}

}
