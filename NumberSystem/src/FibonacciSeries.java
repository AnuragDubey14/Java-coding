//38. Write a program to print fibonacci series upto n terms

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter n terms: ");
        int terms = input.nextInt();
        int num1= 0;
        int num2 = 1;
        int sum = 0;
        for (int i = 0; i < terms; i++) {
            System.out.println(sum);
            num1=num2;
            num2 = sum;
            sum = num1+num2;
        }
    }
}
