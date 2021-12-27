package homework;

public class Question4 {

	public static void main(String args[]) {

		int i = 0;
		int x = 0;
		int evenSum = 0;
		int oddSum = 0;

		for (i = 0; i <= 20; i++) {

			if (i % 2 == 0) {

				evenSum += i;

			}

		}
		System.out.println("The sum of even numbers : " + +evenSum);

		System.out.println(".....................................");

		for (x = 0; x <= 20; x++) {

			if (x % 2 == 1) {

				oddSum += x;
			}
		}

		System.out.println("The sum of odd numbers: " + +oddSum);
	}

}
