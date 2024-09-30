//18. Write a program to calculate HCF of Two given number

import java.util.Scanner;
public class FindHCFTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = input.nextInt();
        int rem = 0,hcf = 0;
        do{
            rem = num1%num2;
            if(rem == 0)
            {
                hcf = num2;
            }
            else
            {
                num1 = num2;
                num2 = rem;
            }
        }
        while(rem != 0);
        System.out.println("The HCF: "+hcf);
    }
}
