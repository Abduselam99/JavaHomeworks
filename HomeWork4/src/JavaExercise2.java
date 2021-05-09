
public class JavaExercise2 {

	public static void main(String[] args) {
		
		/* Write a Java program to test if an array contains a specific value.
		*  [4, 6, 7, 9] x=5
		*/

		int[] myArray = { 4, 6, 7, 9 };
		int num = 5;

		for (int i = 0; i < myArray.length; i++) {
			if (num == myArray[i]) {
				System.out.println(num + " is found.");

			}
			else {
				System.out.println(num + " is not found");
				break;
			}
		}
	}
}
