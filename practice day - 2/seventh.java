// 14. Write a program to convert a string to an integer in Java

import java.util.Scanner;
public class seventh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter  a number(string): ");
        String string = input.nextLine();
        input.close();
        int number = Integer.parseInt(string) ; 
        System.out.println("Converted number:"+number);
    }
}
