import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaExercise3 {

	public static void main(String[] args) {
		/*
		 * Given the list below a.Try to remove the even elements using normal for loop
		 * b.Remove even elements using iterators. 
		 * 
		 * List<Integer> myList = new ArrayList<>();
		 * list.add(1); list.add(2); list.add(4); list.add(4);
		 * list.add(5); list.add(5); List<Integer> myListIterator = new
		 * ArrayList<>(myList);
		 */

		List<Integer> myList = new ArrayList<>();

		myList.add(1);
		myList.add(2);
		myList.add(7);
		myList.add(4);
		myList.add(5);
		myList.add(5);
		

		// a. remove myList using for loop

		for (int i = 0; i < myList.size(); i++) {
			if (myList.get(i) % 2 == 0) {

				myList.remove(i);

			}
		
		}
		System.out.println("All even number has been removed using for loop " + myList);

		// b. remove myListIterator using Iterator

		List<Integer> myListIterator = new ArrayList<>(myList);
		Iterator<Integer> itr = myList.iterator();
		while (itr.hasNext()) {

			if (itr.next() % 2 == 0)
				itr.remove();
		}
		System.out.println("All even number has been removed " + myList);

	}

}
