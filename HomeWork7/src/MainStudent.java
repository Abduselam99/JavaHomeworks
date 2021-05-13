import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class MainStudent  {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student(" Hagos",20));
		students.add(new Student(" Zeray",18));
		students.add(new Student(" Tirhas",25));
		students.add(new Student(" Seble",23));
		
		//Sort the students list with firstName
		Collections.sort( students);
		
		////hint use Collections.sort()
		for (int i = 0; i <students.size(); i++)
		System.out.println(students.get(i));
		
		
	}

}
