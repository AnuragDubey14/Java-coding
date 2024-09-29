
//7. Write a program to check whether a character is alphabet or not
import java.util.Scanner;

public class CheckCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch = input.next().charAt(0);
        input.close();
        if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.printf("%s is a Alphabet", ch);
        }
        else {
            System.out.printf("%s is a Alphabet",ch);
        }
        }
}
