package homework;

public class Hurricane {

	public static void main(String args[]) {

		int i = 74;

		for (i = 74; i >= 74 && i < 105; i++) {

			int windSpeed = 200;
			int category1 = 74;
			int category2 = 105;
			int category3 = 120;
			int category4 = 140;
			int category5 = 165;

			if (windSpeed >= category1 && windSpeed < category2) {

				System.out.println(windSpeed + " Category 1");
				break;
			} else if (windSpeed >= category2 && windSpeed < category3) {

				System.out.println(windSpeed + " Category 2");
				break;
			} else if (windSpeed >= category3 && windSpeed < category4) {

				System.out.println(windSpeed + " Category 3");
				break;
			} else if (windSpeed >= category4 && windSpeed < category5) {

				System.out.println(windSpeed + " Category 4");
				break;
			} else if (windSpeed >= category5) {

				System.out.println(windSpeed + " Category 5");
				break;
			} else {

				System.out.println("Not Considered a Hurricane");
				break;
			}

		}
	}

}
