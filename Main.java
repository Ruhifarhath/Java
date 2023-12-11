
    abstract class Shape {
    // Common instance variables
    protected double base;
    protected double height;
    protected double radius;
    protected double side;

    // Abstract method to be implemented by subclasses
    public abstract void printArea();
}

class Triangle extends Shape {
    // Constructor for Triangle
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Implementation of printArea for Triangle
    @Override
    public void printArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape {
    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of printArea for Circle
    @Override
    public void printArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Square extends Shape {
    // Constructor for Square
    public Square(double side) {
        this.side = side;
    }

    // Implementation of printArea for Square
    @Override
    public void printArea() {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        // Example usage
        Main program = new Main();  // Create an instance of the Main class
        program.run();
    }

    public void run() {
        // Instantiate objects within a non-static method
        Triangle triangle = new Triangle(5, 8);
        Circle circle = new Circle(3);
        Square square = new Square(4);

        // Print areas
        triangle.printArea();
        circle.printArea();
        square.printArea();
    }
}



