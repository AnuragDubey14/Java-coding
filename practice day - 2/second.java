// 9. If a four-digit number is input through the keyboard, 
// write a program to obtain the sum of the first and last digit of this number


import java.util.Scanner;
public class second {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter four digit number:");
        int number = input.nextInt();
        input.close();
        if (number<1000||number>9999){
            System.out.println("Please enter a valid four digit number");
        }
        else {
            int first = number/1000;
            int last=number%10;
            int sum=first+last;
            System.out.println("The sum is:"+sum);
        }
    }
    
}
