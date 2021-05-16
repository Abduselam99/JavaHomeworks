import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

		/*
		 * Write a program that accepts mark of a student and prints the grade If the
		 * average of marks is >= 90 then prints Grade ‘A’ If the average of mark is
		 * >=80 then prints Grade ‘B’ If the average of mark is >=70 then prints Grade
		 * ‘C’ If the average of mark is >=50 then prints Grade ‘D’ else prints Grade
		 * ‘F’ Note: Mark of a student should be between 0 and 100
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your mark result : ");
		try {
		int value = input.nextInt();

		

			if (value >= 90 && value < 101) {
				System.out.println("Your Grade is A ");
			} else if (value >= 80 && value < 90) {
				System.out.println("Your Grade is B ");
			} else if (value >= 70 && value < 80) {
				System.out.println("Your Grade is C ");
			} else if (value >= 50 && value < 70) {
				System.out.println("Your Grade is D ");
			} else if (value >= 0 ){
				System.out.println("Your Grade is F ");
			}
			else {
				System.out.println("invalid number  ");
			}
		} catch (Exception e) {
			System.out.println("Exception: please enter an integer number ");
		}

	}
}
