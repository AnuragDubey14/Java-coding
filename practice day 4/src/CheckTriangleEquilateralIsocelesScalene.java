//16. Write a program to check whether the triangle is equilateral, isosceles or scalene triangle

import java.util.Scanner;
public class CheckTriangleEquilateralIsocelesScalene {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first side: ");
        float first = input.nextFloat();
        System.out.println("Enter Second side: ");
        float second = input.nextFloat();
        System.out.println("Enter third side: ");
        float third  = input.nextFloat();
        input.close();
        if ((first == second)&&(first == third)){
            System.out.println("the triangle is equilateral");
        } else if ((first==second)||(first==third)||(second==third)) {
            System.out.println("The triangle is obsoceles");
        }
        else {
            System.out.println("The triangle is scalene");
        }
    }
}
