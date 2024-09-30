//21. Write a program to input electricity unit charges and calculate total electricity bill according to the given condition:
//
//For first 50 units Rs. 0.50/unit
//For next 150 units Rs. 0.75/unit
//For next 250 units Rs. 1.20/unit
//For unit above 250 Rs. 1.50/unit
//An additional surcharge of 20% is added to the bill

import java.util.Scanner;

public class CalculateElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter electricity units: ");
        double units = input.nextDouble();
        input.close();

        double totalBill = 0.0;

        // Calculate the bill based on the units used
        if (units <= 50) {
            totalBill = units * 0.50;
        } else if (units <= 200) { // From 51 to 200 units
            totalBill = (50 * 0.50) + ((units - 50) * 0.75);
        } else if (units <= 450) { // From 201 to 450 units
            totalBill = (50 * 0.50) + (150 * 0.75) + ((units - 200) * 1.20);
        } else { // Above 450 units
            totalBill = (50 * 0.50) + (150 * 0.75) + (250 * 1.20) + ((units - 450) * 1.50);
        }

        // Adding a surcharge of 20%
        double surcharge = totalBill * 0.20;
        totalBill += surcharge;

        System.out.printf("Total bill: Rs. %.2f%n", totalBill);
    }
}
