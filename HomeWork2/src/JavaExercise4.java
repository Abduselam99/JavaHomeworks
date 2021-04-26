import java.util.Scanner;

public class JavaExercise4 {

	public static void main(String[] args) {
		/*
		 * Write Java program to allow the user to input his/her age. Then the program
		 * will show if the person is eligible to vote. A person who is eligible to vote
		 * must be older than or equal to 18 years old.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int value = input.nextInt();

		if (value >= 18) {
			System.out.println("You are eligible to vote. ");
		}

		else {
			System.out.println("You are not eligible to vote. ");
		}
	
	}

}
