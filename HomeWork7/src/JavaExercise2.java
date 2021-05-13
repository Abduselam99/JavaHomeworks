import java.util.HashSet;
import java.util.Set;

public class JavaExercise2 {

	public static void main(String[] args) {

		/*
		 * Given Two sets below two sets Set1: [3,4,5,7,8,9] Set2 [5,2,4,6,7,11]
		 * 
		 * a.Find the intersection in those sets b.Find the union in those sets c.Find
		 * the only unique elements in set2
		 */

		Set<Integer> Set1 = new HashSet<>();
		Set<Integer> Set2 = new HashSet<>();

		Set1.add(3);
		Set1.add(4);
		Set1.add(5);
		Set1.add(7);
		Set1.add(8);
		Set1.add(9);

		Set2.add(5);
		Set2.add(2);
		Set2.add(4);
		Set2.add(6);
		Set2.add(7);
		Set2.add(11);

		// Find the union in those sets
		
		Set1.addAll(Set2);
		System.out.println("The Union of the two set is : "+ Set1);
		
		// Find the intersection in those sets
		Set1.retainAll(Set2);
		System.out.println("The Intersection of the two set is: " + Set1);

		

		// c.Find the only unique elements in set2

		System.out.println("Unique element of set2 is: " + Set2);

	}
}
