import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		/*
		 * Write a program that validates a phone number input, make sure the length of
		 * the input is 10 digits Example: “6414514473” - Valid phone number
		 * “62354609845454” - Invalid phone number (too long) “56454” Invalid phone
		 * number (too short)
		 * 
		 */
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your phone number : ");
		long num = input.nextLong();
		
		long length = (long)(Math.log10(num) + 1);

		if (length == 10) {
			System.out.println("Valid phone number");

		} else if (length > 10) {
			System.out.println("Invaild phone number it's too long");
		} else if (length < 10) {
			System.out.println("Invalid phone number it's too short");
		} else {
			System.out.println("Invalid input");
		}

	}

}
