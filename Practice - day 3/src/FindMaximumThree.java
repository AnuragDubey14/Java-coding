//2. Write a program to find maximum between three numbers

import java.awt.*;
import java.util.Scanner;
public class FindMaximumThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First number");
        long num1 = input.nextLong();
        System.out.println("Enter Second number");
        long num2 = input.nextLong();
        System.out.println("Enter Third number");
        long num3 = input.nextLong();

        if (num1>num2 && num1>num3){
            System.out.printf("%d is greater than %d and %d",num1,num2,num3);
        } else if (num2>num1 && num2>num3) {
            System.out.printf("%d is greater than %d and %d",num2,num1,num1);
        }
        else if (num3>num2 && num3>num1){
            System.out.printf("%d is greater than %d and %d",num3,num2,num1);

        }
        else {
            System.out.printf("%d ,%d and %d are equal",num1,num2,num3);
        }



    }
}
