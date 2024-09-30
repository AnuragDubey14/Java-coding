//22. while purchasing certain items, a discount of 10% is offered if the quantity
// purchased is more than 100.
// If quantity and price per item are input through the keyboard,
// write a program to calculate the total expenses

import java.util.Scanner;
public class CalculateTotalExpenses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Quantity: ");
        int quantity = input.nextInt();
        System.out.println("Enter Price per item: ");
        double price = input.nextDouble();

        double total_expense =0.0;
        if (quantity>100){
            total_expense = quantity*price;
            total_expense = total_expense*0.10;
        }
        else {
            total_expense = quantity*price;
        }
        System.out.println("Total Expense: "+total_expense);
    }
}
