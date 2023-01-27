package JavaPractice;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// Initialize Scanner
		Scanner input = new Scanner(System.in);
		// Prompt user for input 
		System.out.println("Give me input!");
		String success = input.nextLine();
		// Tell the user what they said
		System.out.println("Success! You said: " + success);

		// Do something based on the input
		switch (success) {
			case "one":
				// TODO: The thing
				break;
			default:
				System.out.println("Invalid input!");
				break;
		}
	}

}
