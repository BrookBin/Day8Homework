package homework;

public class Question4WhileLoop {

	public static void main(String args[]) {

		int num = 1;
		int num1 = 1;
		int evenSum = 0;
		int oddSum = 0;

		while (num <= 20) {

			if (num % 2 == 0) {

				evenSum += num;
			}
			num++;
		}
		System.out.println("The sum of the even numbers: " + evenSum);
		
		System.out.println("....................");

		while (num1 <= 20) {

			if (num1 % 2 == 1) {

				oddSum += num1;
			}
			num1++;
		}
		System.out.println("The sum of the odd numbers: "+ oddSum);
	}

}