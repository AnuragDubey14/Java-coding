//Write Java program to Perform subtraction without using minus (-) operator


import java.util.Scanner;
public class twelve {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1 = 0,num2 = 0,sub = 0;
        System.out.println("Enter first number:");
        num1 = input.nextInt();
        System.out.println("Enter Second number:");
        num2 = input.nextInt();
        input.close();

        sub = num1+~num2+1;
        System.out.printf("Subtraction of %d - %d = %d",num1,num2,sub);

    }
}