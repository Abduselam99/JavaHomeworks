
import java.util.Scanner;

public class JavaExercise2 {


	public static void main(String[] args) {
		/*
		 * Write a Java program to check if an input string starts with “T”. If it is
		 * start with “T” print “Yes that is the string”, otherwise print “That is not
		 * the one”.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a text ");
		String value = input.nextLine();

		if (value.startsWith("T")) {
			
			System.out.println("Yes that is the string ");
		} else {
			System.out.println("That is not the one ");
		}
	}

}
