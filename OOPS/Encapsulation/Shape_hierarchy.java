package OOPS.Encapsulation;
import java.util.Arrays;

// --- 1. ABSTRACT BASE CLASS ---
abstract class Shape {
    // Abstract methods to be implemented by subclasses
    public abstract double area();
    public abstract double perimeter();
}

// --- 2. CONCRETE CLASSES ---

class Circle extends Shape {
    // Enforcing immutability: private final variable with no setter
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter only (provides read-only access)
    public double getRadius() {
        return this.radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}

class Triangle extends Shape {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        // Heron's Formula for area using three sides
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}

// --- 3. MAIN EXECUTION ---
public class Shape_hierarchy {
    public static void main(String[] args) {
        // Storing shapes in an array
        Shape[] shapes = {
                new Circle(5.0),
                new Rectangle(4.0, 7.0),
                new Triangle(3.0, 4.0, 5.0)
        };

        // Printing a formatted area report
        System.out.println("=========================================");
        System.out.printf("%-15s | %-10s | %-10s%n", "Shape Type", "Area", "Perimeter");
        System.out.println("=========================================");

        for (Shape shape : shapes) {
            // Get the simple class name (e.g., "Circle")
            String shapeName = shape.getClass().getSimpleName();

            // Format numbers to 2 decimal places
            System.out.printf("%-15s | %-10.2f | %-10.2f%n",
                    shapeName,
                    shape.area(),
                    shape.perimeter()
            );
        }
        System.out.println("=========================================");
    }
}
