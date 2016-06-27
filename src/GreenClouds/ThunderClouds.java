package GreenClouds;

import java.util.Scanner;

import BlueClouds.RainClouds;

public class ThunderClouds {

	public static int myheight;

	public static void thunder() {
		String water = "ice";
		int height = 1000;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a height in meters:");
		myheight = scanner.nextInt();

		if (water.equals("ice") && myheight > height) {
			System.out.println("Yehhh man, it's going to be a stormy night!!");
		} else {
			System.out.print("No storm today. Rest in peace bro!");
		}
	}

	public static void main(String[] args) {

		RainClouds tc = new RainClouds();
		tc.hail();

		RainClouds.DustyClouds tc1 = tc.new DustyClouds();
		tc1.tornado();

	}
}
