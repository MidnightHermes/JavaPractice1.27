package JavaPractice;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// Initialize Scanner
		Scanner input = new Scanner(System.in);
		// Prompt user for input 
		System.out.println("Give me input!");
		String kind = (input.nextLine()).toLowerCase();
		System.out.println("Name your animal!");
		String name = input.nextLine();
		// Tell the user what they said
		System.out.println("Success! You will adopt a " + kind + " named " + name);

		// Do something based on the input
		switch (kind) {
			case "dog":
				MainInterface dog = new Dog(name);
				dog.speak();
				break;
			case "cat":
				MainInterface cat = new Cat(name);
				cat.speak();
				break;
			default:
				System.out.println("Invalid input!");
				break;
		}
	}

}
