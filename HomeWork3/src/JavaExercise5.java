import java.util.Scanner;

public class JavaExercise5 {

	public static void main(String[] args) {
		/*
		 * Use while loop and create a program that calculates the average of the
		 * numbers between x and y. x and y are the integers the user has to input.
		 */

		Scanner in = new Scanner(System.in);

		System.out.print("Input first number: ");
		int num1 = in.nextInt();

		System.out.print("Input second number: ");
		int num2 = in.nextInt();
		
		int sum;
		double average;
		

		//int sum = num1 + num2;
		//double average = sum/2;
		
		while (true) {
			
			sum = num1 + num2;
			average = sum /2;

			System.out.println("Average of you entries is : " + average);
			break;
		}
	
		

	}
}
