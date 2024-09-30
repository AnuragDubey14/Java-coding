//37. Write a Java program that reads an positive integer and count the number of digits

import java.util.Scanner;
public class CountDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int num = input.nextInt();
        if (num>0){
            int c = 0;
            int temp = num;
            while (num!=0){
                num/=10;
                c++;
            }
            System.out.printf("Total number of digit in %d is %d",temp,c);
        }
        else {
            System.out.println("Please enter a positive integer.");
        }
    }
}
