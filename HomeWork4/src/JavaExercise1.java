
public class JavaExercise1 {

	public static void main(String[] args) {
		
		/* Write a Java program to calculate the average 
		 * value of array integers.
		 */
		
		int [] values = new int [] {10, 20, 30, 40};
		
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
		sum = sum + values[i];
		}
		
		double average = sum / values.length;
		System.out.println("The average value of the array element is: " + average);
		
			
	}

}
