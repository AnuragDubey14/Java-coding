
//10. Write a program to check whether a character is uppercase or lowercase alphabet

import java.util.Scanner;
public class CheckCharacterUpperOrLower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
        if (ch>='a' && ch<='z'){
            System.out.printf("%s is in lowercase",ch);
        }
        else if (ch>='A' && ch<='Z') {
            System.out.printf("%s is in Uppercase",ch);

        }
        else{
            System.out.printf("%s is not a alphabet",ch);
        }
    }
}
