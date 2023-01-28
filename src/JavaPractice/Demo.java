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
			burger = new Burger();
			burger.total();
		} else {
			System.out.println("Healthy choice!");
			salad = new Salad();
			salad.total();
		}
		
		// Close the Scanner to prevent memory leaks
		input.close();
	}

}
