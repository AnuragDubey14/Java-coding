//9. Write a program to find sum of all natural numbers between 1 to n

import java.util.Scanner;
public class SumOfNNaturalNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N: ");
        int num = input.nextInt();
        int sum = 0;
        for(int i = 1;i<=num;i++){
            sum+=i;
        }
        System.out.printf("Sum of Natural number from %d to %d  = %d",1,num,sum);
    }
}
