// 6. Two numbers are input through the keyboard into two locations C and D.
//  Write a program to interchange the contents of C and D.


import java.util.Scanner;
public class sixth {
    public static void main(String[] args) 
    {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter first number");
    int num1 = input.nextInt();
    System.out.println("Enter second number");
    int num2 = input.nextInt();
    
    input.close();

    int temp = num1;
    num1 = num2;
    num2= temp;

    System.out.println("First number after exchange: "+num1);
    System.out.println("Second number after exchange: "+num2);

        
    }
    
}
