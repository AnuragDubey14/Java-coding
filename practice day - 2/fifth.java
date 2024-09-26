// 12. If the total selling price of 15 items and the total profit earned on them is input through the keyboard, 
// write a program to find the cost price of one item.

import java.util.Scanner;
public class fifth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter selling price of 15 items:");
        double selling_price = input.nextDouble();

        System.out.println("Enter total profit earned");
        double profit = input.nextDouble();
        input.close();

        double cost_price= selling_price-profit;
        System.out.println("cost price:"+cost_price);
        
    }
    
}
