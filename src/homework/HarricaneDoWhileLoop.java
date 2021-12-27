package homework;

public class HarricaneDoWhileLoop {

	public static void main(String[] args) {

		int i = 74;

		do {
			int windSpeed = 155;
			int category1 = 74;
			int category2 = 105;
			int category3 = 120;
			int category4 = 140;
			int category5 = 165;

			if (windSpeed >= category1 && windSpeed < category2) {

				System.out.println("Wind speed is " + i + " mph" + " category 1");
				break;
			} else if (windSpeed >= category2 && windSpeed < category3) {

				System.out.println("Wind speed is " + windSpeed + " mph" + " category 2");
				break;
			} else if (windSpeed >= category3 && windSpeed < category4) {

				System.out.println("Wind speed is " + windSpeed + " mph" + " category 3");
				break;
			} else if (windSpeed >= category4 && windSpeed < category5) {

				System.out.println("Wind speed is " + windSpeed + " mph" + " category 4");
				break;
			} else if (windSpeed >= category5) {

				System.out.println("Wind speed is " + windSpeed + " mph" + " category 5");
				break;
			} else {

				System.out.println("Not a hurricane.");
				break;
			}

		} while (i >= 74);
	}

}
