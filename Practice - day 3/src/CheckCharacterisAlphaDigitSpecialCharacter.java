
//9. Write a program to input any character and check whether it is alphabet, digit or special character

import java.util.Scanner;
public class CheckCharacterisAlphaDigitSpecialCharacter {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = input.next().charAt(0);
        if ((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
            System.out.printf("%s is alphabet",ch);
        } else if ((ch>='0') && (ch<='9')){
            System.out.printf("%s is digit",ch);
        }
        else {
            System.out.printf("%s is Special character",ch);
        }
    }
}
