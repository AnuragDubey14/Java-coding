//8. Write a program to input any alphabet and check whether it is vowel or consonant

import java.util.Scanner;
public class CheckVowel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a alphabet");
        char ch = input.next().charAt(0);
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.printf("%s is vowel",ch);
        }
        else {
            System.out.printf("%s is a consonant",ch);
        }
    }
}
