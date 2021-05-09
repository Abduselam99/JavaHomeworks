import java.util.Scanner;

public class JavaExercise3 {

	public static void main(String[] args) {

		/*
		 * Write a program that takes integer input ( 1 to 7) from the a user ,1
		 * representing Monday to 7 representing Sunday. The program should decide
		 * whether the day input is a weekend or a weekday.(Use switch statement)
		 */

		Scanner in = new Scanner(System.in);
		System.out.print("Input number: ");
		
		int day = in.nextInt();
		
		// Create a Scanner object for keyboard input.
		System.out.println(getDayName(day));
	}

	// Get the name for the Week

	public static String getDayName(int day) {
		String dayName = "";
		switch (day) {
		case 1:
			dayName = "Monday: it's Weekday";
			break;
		case 2:
			dayName = "Tuesday: it's Weekday ";
			break;
		case 3:
			dayName = "Wednesday: it's Weekday";
			break;
		case 4:
			dayName = "Thursday: it's Weekday";
			break;
		case 5:
			dayName = "Friday: it's Weekday";
			break;
		case 6:
			dayName = "Saturday: it's Weekend";
			break;
		case 7:
			dayName = "Sunday: it's Weekend";
			break;
		default:
			dayName = "Invalid day range";
		}

		return dayName;

	}
}
