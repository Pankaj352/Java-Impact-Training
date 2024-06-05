public class Circle {

    // Declare a final variable PI
    private static final double PI = 3.14159;

    // Declare a private variable radius
    private double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double getArea() {
        return PI * radius * radius;
    }

    // Method to display the area of the circle
    public void displayArea() {
        System.out.println("The area of the circle is: " + getArea());
    }

    // Main method
    public static void main(String[] args) {
        // Create a Circle object with radius 5
        Circle circle = new Circle(5);

        // Calculate and display the area of the circle
        circle.displayArea();
    }
}