//13. Write a program to find the factorial value of any number

import java.util.Scanner;
public class FindFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int temp = num;
        int fact = 1;
        while(num>0){
            fact=fact*num;
            num--;
        }
        System.out.printf("The Factorial of %d = %d",temp,fact);
    }
}
