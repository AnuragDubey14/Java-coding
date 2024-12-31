// Abstract class Shape
abstract class Template {
    // Abstract method: subclasses must provide an implementation
    abstract void draw();

    // Concrete method: can be used by subclasses directly
    public double area() {
        System.out.println("Calculating area...");
        return 0;
    }

    // Concrete method
    public double perimeter() {
        System.out.println("Calculating perimeter...");
        return 0;
    }
}

// Concrete class Circle extends Shape
class Circle1 extends Template {
    private double radius;

    // Constructor to initialize the radius of the circle
    Circle1(double radius) {
        this.radius = radius;
    }

    // Override the abstract method draw()
    @Override
    void draw() {
        System.out.println("Drawing a circle with radius: " + radius);
    }

    // Override the area method
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // Override the perimeter method
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Concrete class Rectangle extends Shape
class Rectangle extends Template {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override the abstract method draw()
    @Override
    void draw() {
        System.out.println("Drawing a rectangle with length: " + length + " and width: " + width);
    }

    // Override the area method
    @Override
    public double area() {
        return length * width;
    }

    // Override the perimeter method
    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}


public class Abstraction {
    public static void main(String[] args) {
        Template circle = new Circle1(5);
        Template rectangle = new Rectangle(4, 7);

        circle.draw(); // Drawing a circle with radius: 5
        System.out.println("Area of Circle: " + circle.area()); // Area of Circle: 78.5398...
        System.out.println("Perimeter of Circle: " + circle.perimeter()); // Perimeter of Circle: 31.4159...

        rectangle.draw(); // Drawing a rectangle with length: 4 and width: 7
        System.out.println("Area of Rectangle: " + rectangle.area()); // Area of Rectangle: 28
        System.out.println("Perimeter of Rectangle: " + rectangle.perimeter()); // Perimeter of Rectangle: 22
    }
}
