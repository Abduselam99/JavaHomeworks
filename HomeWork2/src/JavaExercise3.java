import java.util.Scanner;

public class JavaExercise3 {

	public static void main(String[] args) {
		/* Write a Java program to get a number from the user and 
		 * print whether it is positive or negative
		 */
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter a number : ");
		int value = input.nextInt();
		
		if (value > 0) {
			System.out.println("Your number is  positive. ");
		}
		else if (value < 0) {
			System.out.println("Your number is Negative. ");
		}
		else {
			System.out.println("Your number is invalid, number must be either positive or negative ");
		}
	}

}
