package ThreeDimentions;

public class ThreeDimentional extends Polygon {
	
	// Create a ThreeDimentionalShape class inheriting from Polygon class. 
	// Add height property, create a constructor with Sides , color and Height.
	// Add a method to display the height.

	private int height;

	public ThreeDimentional(int side, String color, int height) {
		
		super(side, color);
		this.height = height;
	}

	public void getHeight() {
		System.out.println(this.height);
	}
}
