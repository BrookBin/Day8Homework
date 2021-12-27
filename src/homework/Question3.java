package homework;

public class Question3 {

	public static void main(String args[]) {

		float num = 30.0f;
		float sum = 0.0f;
		int n = 10;

		for (int i = 20; i <= num; i++) {

			sum = sum + i;

		}

		System.out.println("Average = " + (sum/n));
	}
}
