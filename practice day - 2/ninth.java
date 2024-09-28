
// 16. Write Java program to Swap two numbers using bitwise operator

import java.util.Scanner;
public class ninth {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();
        input.close();
        System.out.printf("Before Swapping Num1 : %d || Num2 : %d", num1, num2);
		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;
		System.out.printf("\nAfter Swapping Num1 : %d || Num2 : %d", num1, num2);

    }
}