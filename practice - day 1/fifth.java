// 5. The length & breadth of a rectangle and radius of a circle are input through the keyboard. 
// Write a program to calculate the area & perimeter of the rectangle, and the area & circumference of the circle.

import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of rectangle:");
        double length = input.nextDouble();
        System.out.println("Enter the breadth of rectangle:");
        double breadth = input.nextDouble();
        System.out.println("Enter the radius of circle:");
        double radius = input.nextDouble();
        input.close();

        double area_rectangle= length*breadth;
        double perimeter_rectangle=2*(length+breadth);

        double area_circle = radius*radius*Math.PI;
        double circle_circumference = 2*radius*Math.PI;

        System.out.println("Area of Rectangle:"+area_rectangle);
        System.out.println("Perimeter of Rectangle:"+perimeter_rectangle);
        System.out.println("Area of circle:"+area_circle);
        System.out.println("Circumference of circle:"+circle_circumference);

    }
}
