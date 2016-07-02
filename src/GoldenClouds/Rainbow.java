package GoldenClouds;

import java.util.Scanner;

public class Rainbow {
	
	enum Importance {
		Low, Medium, High
	}
	public static void summer(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose your temperature: ");
		String level = scanner.next();

		// create a variable
		Importance snow = Importance.valueOf(level);

		// Test the Importance.
		if (snow == Importance.Low) {
			System.out.println("You like cold weather!");
		} else if (snow == Importance.Medium) {
			System.out.println("You like mild weather!");
		} else if (snow == Importance.High) {
			System.out.println("You like hot weather!");
		}
	}
	}
