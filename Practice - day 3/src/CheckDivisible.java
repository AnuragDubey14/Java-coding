//4. Write a program to check whether a number is divisible by 5 and 11 or not

import java.util.Scanner;
public class CheckDivisible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        long num = input.nextLong();

        if (num%5==0 && num%11==0){
            System.out.printf("%d is divisible by %d and %d",num,5,11);
        }
        else {
            System.out.printf("%d is not divisible by %d or %d",num,5,11);
        }


    }
}
