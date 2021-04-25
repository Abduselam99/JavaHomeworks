
public class JavaExercise7 {

	public static void main(String[] args) {
		/* Write a Java program to print the area and perimeter of a circle. 
		 * Test Data:
		 * Hint: Use Math.PI
		 * Radius = 7.5
		 */
		
		double radius =7.5;
		double perimetre = 2* Math.PI*radius;
		double area = Math.PI*radius*radius;
		
		System.out.println("perimetre is =" + perimetre);
		System.out.println("area is =" + area);
				
	}

}
