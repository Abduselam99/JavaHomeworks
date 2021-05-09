package ThreeDimentions;

public class Polygon {

	/*  Write a java program that has a Polygon class with a property Sides and color. 
		
	*/
	
	private int sides;
	private String color;
	
	// Modify your code from question 1 by adding a constructor for the Polygon class 
	// and user should pass the values for Sides and color during the initialization.

	public Polygon(int sides, String color) {
		this.sides = sides;
		this.color = color;
	}

	public void getSides() {
		// return this.sides;
		System.out.println(this.sides);
	}

	public void getColor() {
			System.out.println(this.color);

	}

}
