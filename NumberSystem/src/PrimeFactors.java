//45. Write a Program to print Prime factors in java

import java.util.Scanner;
public class PrimeFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        for (int i = 2; i <=num ; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }
    }
}
