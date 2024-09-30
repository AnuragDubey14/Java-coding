//16. write a program to sum of its Digits

import java.util.Scanner;
public class FindSumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        input.close();
        int sum = 0;
        while(num>0){
            sum = sum+num%10;
            num/=10;
        }
        System.out.printf("The sum of digits = "+sum);
    }
}
