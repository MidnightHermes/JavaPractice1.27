package JavaPractice;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// Initialize Scanner
		Scanner input = new Scanner(System.in);
		// Prompt user for input 
		System.out.println("Would you like a cat or a dog?");
		String kind = input.nextLine();
		System.out.println("What will you name it?");
		String name = input.nextLine();
		// Tell the user what they said
		System.out.println("Success! You will adopt a " + kind + " named " + name);

		// Do something based on the input
		if (kind == "dog") {
			MainInterface puppy = new Dog(name);
			puppy.speak();
		} else if (kind == "cat") {
			MainInterface kitty = new Cat(name);
			kitty.speak();
		} else {
			System.out.println("Invalid input!");
		}
	}

}
