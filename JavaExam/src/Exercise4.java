import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		/* Write a program that takes a string and displays the vowels count in the input string.
		Vowels are: a, e, i, o, u
		Example: 	Input:  Africa
		output :  3
		input : sky
		Output : 0
 		//use the String methods, charAt, and contains. 
		 */
		
		 int count = 0;
	      System.out.println("Enter a string :");
	      Scanner value = new Scanner(System.in);
	      String sentence = value.nextLine();

	      for (int i=0 ; i<sentence.length(); i++){
	         char ch = sentence.charAt(i);
	         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
	            count ++;
	         }
	      }
	      System.out.println("Number of vowels in the given string is : "+count);
	   }
	}
