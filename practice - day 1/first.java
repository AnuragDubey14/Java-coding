// 1. Ramesh's basic salary is input through the keyboard.
//  His dearness allowance is 40% of basic salary, and house 
// rent allowance is 20% of basic salary.
//  Write a program to calculate his gross salary.

import java.util.Scanner;


public class first {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Enter Ramesh Basic Salary:");
        int number = myObj.nextInt();  // Read user input
        myObj.close();
        System.out.println("Ramesh Salary:" + number);  // Output user input

        long gross_salary=number+(number*40)/100+ (number*20)/100;
        System.out.println("Gross Salary of Ramesh:" + gross_salary);
            
    }
    
}
