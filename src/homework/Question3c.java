package homework;

public class Question3c {

	
	public static void main (String args []) {
		
		float num = 20.0f;
		float sum = 0.0f;
		int n = 10;
		
		do {
			
			 sum+= num;	num++;
			
		} while (num <=30);
		
		System.out.println("Average = " +sum/n);
	}

}
