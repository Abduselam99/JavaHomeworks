
public class Exercise3 {

	public static void main(String[] args) {
		
		/*Write a program that takes a number and prints n row pyramid accordingly 
		For example: if a user inputs 3, it prints the below three ‘*’ in three rows
		 	*
		 	**
		 	***
		*/

		
			for (int i = 0; i < 6; i++) {

				System.out.print(" ");

				for (int k = 0; k <= i; k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		

	}

}
