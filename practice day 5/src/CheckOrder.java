//38. Write a java program that accepts three numbers from the user and
// check if numbers are in "increasing" or "decreasing" order

import java.util.Scanner;
public class CheckOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double first = input.nextDouble();
        System.out.println("Enter Second number: ");
        double second = input.nextDouble();
        System.out.println("Enter Third Number: ");
        double third = input.nextDouble();
        if ((first>second) && (second>third)){
            System.out.println("Number is in decreasing order");
        } else if ((first<second) && (second<third)) {
            System.out.println("Number is in increasing order");
        }
        else {
            System.out.println("Numbers not in increasing or decreasing.");
        }
    }
}
