//28. A five-digit number is entered through the keyboard. Write a program to obtain the reversed
// number and to determine whether the original and reversed numbers are equal or not

import java.util.Scanner;
public class CheckPalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a five digit number");
        long num = input.nextLong();
        input.close();
        if (num>9999 && num<99999){
            long rev=0;
            long temp = num;
            while (temp!=0){
                rev = rev*10+temp%10;
                temp/=10;
            }
            if (num==rev){
                System.out.println("The five digit number is palindrome");
            }
            else {
                System.out.println("The number is not a palindrome");
            }

        }
        else{
            System.out.printf("%d is not a five digit number",num);
        }
    }
}
