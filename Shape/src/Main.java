class Shape {
    // Methods to be overridden by subclasses
    double getPerimeter() {
        return 0.0;
    }

    double getArea() {
        return 0.0;
    }
}

// Circle subclass extending Shape
class Circle extends Shape {
    private double radius;

    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override getPerimeter() method to calculate the perimeter of a circle
    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override getArea() method to calculate the area of a circle
    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an instance of Circle
        Circle circle = new Circle(5.0);

        // Calculating and displaying the perimeter and area of the circle
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Circle Area: " + circle.getArea());
    }
}
