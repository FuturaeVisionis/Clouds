package YellowClouds;

public class StormClouds {

	public static BlueClouds.RainClouds hurricane;

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		GreenClouds.ThunderClouds wildStuff = null;
		
		wildStuff.thunder();
		hurricane.hail();

	}

	public static void Altitude() {
		String value = "Predicting the Weather is very difficult";
		int water = 45;

		try {
			System.out.println("This weeks ammount of rain per square inche is " + value.length());
			System.out.println("Today's humidity is: " + water / 40 + "%");

		} catch (Exception ex) {
			System.out.println("We have a problem with today's weather prediction!");

		} finally {
			System.out.println("That was the weather for today. Have a good one!");
		}
	}
}
		
