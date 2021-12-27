package homework;

public class Question4DoWhileLoop {

	public static void main(String args[]) {

		int num = 1;
		int num1 = 1;
		int evenSum = 0;
		int oddSum = 0;

		do {
			if (num % 2 == 0) {

				evenSum += num;
			}

			num++;

		} while (num <= 20);

		System.out.println("The sum of the even numbers: " + evenSum);
		System.out.println(".......................................... ");
		
		do {
			if (num1 % 2 == 1) {

				oddSum += num1;
			}

			num1++;

		} while (num1 <= 20);

		System.out.println("The sum of the even numbers: " + oddSum);
		
	}

}
