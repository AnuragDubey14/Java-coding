abstract class Shape {
    int x, y;

    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Concrete method
    void draw() {
        System.out.println("Drawing a generic shape at " + x + ", " + y);
    }

    void moveTo(int newX, int newY) {
        System.out.println("Moving to " + newX + ", " + newY);
        this.x = newX;
        this.y = newY;
    }
}

class Circle extends Shape {
    Circle(int x, int y) {
        super(x, y);
    }

    // No override required, but can override if desired
    @Override
    void draw() {
        super.draw(); // Call the inherited method
        System.out.println("Drawing a circle at " + x + ", " + y);
    }
}


public class AbstractClasses {
    public static void main(String[] args) {
        Shape shape = new Circle(10, 20);
        shape.draw(); // Outputs: Drawing a circle at 10, 20
        shape.moveTo(30, 40); // Outputs: Moving to 30, 40
    }
}
