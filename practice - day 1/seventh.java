// If a five-digit number is input through the keyboard, 
// write a program to reverse the number.


import java.util.Scanner;
public class seventh{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter five digit number:");
    long number = input.nextLong();

    if (number<10000 || number>99999){
        System.out.println("Please enter a valid five digit number.");
    }
    else{
        input.close(); 
        long reversed_number = 0;
        while (number!=0) {
            long digit = number%10;
            reversed_number = reversed_number*10+digit;
            number/=10;            
        }
        System.out.println("Reversed number:"+reversed_number);
    }

}
    
}