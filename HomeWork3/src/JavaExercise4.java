import java.util.Scanner;

public class JavaExercise4 {

	public static void main(String[] args) {
		
		/* Write a program that takes a positive integer input 
		 * and prints all the positive even number less than 
		 * the number in order from big to small.
		 * (Use do while loop)
		 */

		Scanner in = new Scanner(System.in);
		System.out.print("Input number: ");
		int num = in.nextInt();
		
		do
		{
			--num;
			
			if( num % 2 == 0)
			{
				System.out.println(num);
		    }
		 
		}while (num > 1);
	}

}
