//15. write a program to reverse the given Digits

import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int rev = 0;
        int temp = num;
        while(num>0){

            rev= rev*10+num%10;
            num/=10;
        }
        System.out.printf("Reverse of %d  = %d",temp,rev);
    }
}
