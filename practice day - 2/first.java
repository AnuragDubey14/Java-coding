// 8. If a five-digit number is input through the keyboard, 
// write a program to calculate the sum of its digits. ( Hint: Use the modulus operator '%')

import java.util.Scanner;
public class first{
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter five digit input:");
        int number=input.nextInt();
        input.close();
        if (number<10000||number>99999){
            System.out.println("Please enter a valid five digit number.");
        }
        else {
            int sum=0;
            while (number!=0) {
                int digit = number%10;
                sum+=digit;
                number/=10;
            }
            System.out.println("The sum of digit:"+sum);
        }
        
    }
}