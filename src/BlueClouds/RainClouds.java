package BlueClouds;

import java.util.Random;

public class RainClouds {

	public static void hail() {
		System.out.println("Hi there rainy days!");
	}

	public class DustyClouds {

		public void tornado() {
			int drops = 150;
			int sidewind = 88;

			System.out.println("Barometer reading is: " + drops + sidewind);
		}

		public class WindBlast {
			public void icyrain() {
				
				Random sandstorm = new Random();
				int randomselector = sandstorm.nextInt();
				
				if (randomselector < 100) {
					System.out.println("I like icy rain.");
				}else{
					System.out.println("It never rains in London.");
				}
			}
		}
	}
}