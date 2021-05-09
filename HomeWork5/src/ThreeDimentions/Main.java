package ThreeDimentions;

public class Main {

	public static void main(String[] args) {
		
		//In the main class create 3 objects triangle, rectangle and pentagon.
		
		Polygon triangle = new Polygon(3, "Red");
		Polygon rectangle = new Polygon(4, "Orange");
		Polygon pentagon = new Polygon(7, "Pink");

		// Modify your code from question 1 by adding two methods to display 
		// the number of sides and color of the polygon object created. 
		// In the main class call the methods for every object you have created. 
		
		triangle.getSides();
		triangle.getColor();

		rectangle.getSides();
		rectangle.getColor();

		pentagon.getSides();
		pentagon.getColor();
		
		// In the main class create a rectangular 3D object and call all the methods 
		// to display all the properties.
		
		ThreeDimentional box = new ThreeDimentional(4, "Black", 10);
		box.getSides();
		box.getColor();
		box.getHeight();

	}

}
