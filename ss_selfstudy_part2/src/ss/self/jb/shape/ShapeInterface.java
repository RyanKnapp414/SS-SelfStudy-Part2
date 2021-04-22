/**
 * 
 */
package ss.self.jb.shape;

/**
 * Shape interface to be used with rectangle, triangle, and circle
 * 
 * @author Ryan
 *
 */
public class ShapeInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Rectangle class implementing Shape interface
		Rectangle myRectangle = new Rectangle();
		myRectangle.display(myRectangle.calculateArea());

		// Triangle class implementing Shape interface
		Triangle myTriangle = new Triangle();
		myTriangle.display(myTriangle.calculateArea());

		// Circle class implementing Shape interface
		Circle myCircle = new Circle();
		myCircle.display(myCircle.calculateArea());
	}

	// shape interface
	interface Shape {
		public double calculateArea();

		public void display(double area);
	}

	static class Rectangle implements Shape {
		public double calculateArea() {
			// declaring variables
			int length = 7;
			int width = 2;

			// calculating area
			double area = length * width;

			return area;
		};

		public void display(double area) {
			System.out.println("The area of the rectangle is " + Double.toString(area));
		};
	}

	static class Triangle implements Shape {
		public double calculateArea() {
			// declaring variables
			int height = 3;
			int base = 5;

			// calculating area
			double area = .5 * base * height;

			return area;
		};

		public void display(double area) {
			System.out.println("The area of the triangle is " + Double.toString(area));
		};
	}

	static class Circle implements Shape {
		public double calculateArea() {
			// declaring variable
			int radius = 4;

			// calculating area
			double area = radius * radius * Math.PI;

			return area;
		};

		public void display(double area) {
			System.out.println("The area of the circle is " + Double.toString(area));
		};
	}

}
