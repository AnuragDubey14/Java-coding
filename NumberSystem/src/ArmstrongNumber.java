//Write a program to check armstrong number


import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        String num = input.nextLine();
        int TotalDigit = num.length();
        int number = Integer.parseInt(num);
        int temp = number;
        int sum = 0;
        int digit = 0;
        while (temp>0){
            digit = temp%10;
            int power = 1;
            for (int i = 0; i < TotalDigit; i++) {
                power*=digit;
            }
            sum+=power;
            temp/=10;
        }
        if (number == sum) {
            System.out.printf("%d is armstrong number",number);
        }
        else {
            System.out.printf("%d is not a armstrong number",number);
        }
    }
}
