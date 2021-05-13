import java.util.HashSet;
import java.util.ArrayList;

public class JavaExercise1 {

	public static void main(String[] args) {

		// Given the list below, please find the sorted unique values,
		// using the set interface(‘A’,’F’,’A’,’D’, ‘F’,’C’, ‘B’)

		ArrayList<String> myset = new ArrayList<String>();

		myset.add("A");
		myset.add("F");
		myset.add("A");
		myset.add("D");
		myset.add("F");
		myset.add("C");
		myset.add("B");

		HashSet<String> SetNumbers = new HashSet<String>(myset);

		for (String strNumber : SetNumbers)
			System.out.println(strNumber);
	}

}
