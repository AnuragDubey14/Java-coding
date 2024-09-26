// 13. If a five-digit number is input through the keyboard, 
// write a program to print a new number by adding one to each of its digits.
//  For example, if the number that is input is 12391 then the output should be displayed as 23402.

import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a five-digit number:");
        long number = input.nextLong();
        input.close();

        if (number < 10000 || number > 99999) {
            System.out.println("Enter a valid five-digit number");
        } else {
            long newNumber = 0;
            long multiplier = 1; 
            while (number != 0) {
                long digit = number % 10;
                digit = (digit + 1) % 10;
                newNumber = newNumber + digit * multiplier;
                multiplier *= 10; 
                number /= 10;
            }
            System.out.println("Result: " + newNumber);
        }
    }
}
