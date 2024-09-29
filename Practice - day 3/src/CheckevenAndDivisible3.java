// Check if number is even and divisible by 3

import  java.util.Scanner;
public class CheckevenAndDivisible3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        input.close();

        if (num%2 ==0 && num%3 == 0){
            System.out.println("The number is even and divisible by 3 - "+num);
        }
        else {
            System.out.println("The number is not even or not divisible by 3 - "+num);
        }

    }
}
