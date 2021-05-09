
public class JavaExercise4 {

	public static void main(String[] args) {
		
		/*   Write a Java program to copy an array by iterating the array. 
		*    Arr1 [3, 4,5,2] 
		*    Arr2 [null, null, null, null] 
		*    */

		int Arr1 [] = {3,4,5,2};
		int Arr2 [] = new int [Arr1.length];
		
		for (int i =0; i < Arr1.length; i++) {
			Arr2 [i] = Arr1[i];
			
			System.out.println(Arr2[i]);
			
		}
		
	}

}
