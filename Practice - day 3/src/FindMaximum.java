
//1. Write a program to find maximum between two numbers
import java.util.Scanner;
public class FindMaximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        long num1 = input.nextInt();

        System.out.println("Enter Second number");
        long num2 = input.nextInt();

        if (num1>num2){
            System.out.printf("%d is greater than %d",num1,num2);
        }
        else if(num1<num2){
            System.out.printf("%d is greater than %d",num2,num1);
        }
        else {
            System.out.printf("%d and %d are equal",num1,num2);
        }

    }
}

